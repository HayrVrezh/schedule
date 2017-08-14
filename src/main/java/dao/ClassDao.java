package dao;

import model.entity.Classs;
import model.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

/**
 * Created by Администратор on 21.07.2017.
 */
@Repository
public class ClassDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ClassDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int add(Classs classs) {
        System.out.println("4");
        final String sql = "insert into class(class) values(?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, classs.getClasss());
            return ps;
        }, holder);
        System.out.println("5");
        return (int) holder.getKey().longValue();
    }

    public Integer getId(Integer clazz){
        final String sql = "select * from class where class = ?";
        Classs classs = jdbcTemplate.queryForObject(sql, new ClassMapper(), clazz);
        return  classs.getClassId();
    }

    public Integer getClasss(Integer classId){
        final String sql = "select * from class WHERE classId = ?";
        Classs classs = jdbcTemplate.queryForObject(sql, new ClassMapper(), classId);
        return  classs.getClasss();
    }
}
