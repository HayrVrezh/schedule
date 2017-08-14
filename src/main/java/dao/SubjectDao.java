package dao;

import model.entity.Classs;
import model.mapper.ClassMapper;
import model.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import model.entity.Subject;


/**
 * Created by Администратор on 21.07.2017.
 */
@Repository
public class SubjectDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SubjectDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Integer getId(String subjectt){
        final String sql = "select * from subject where subject = ?";
        Subject subject = jdbcTemplate.queryForObject(sql,new SubjectMapper(),subjectt);
        return subject.getSubjectId();
    }

}
