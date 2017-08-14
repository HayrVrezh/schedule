package dao;

import model.entity.Student;
import model.entity.Subject;
import model.entity.Teacher;
import model.mapper.SubjectMapper;
import model.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

/**
 * Created by Администратор on 21.07.2017.
 */
@Repository
public class TeacherDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TeacherDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int add(Teacher teacher){
        final String sql = "insert into student(lastname,firstname,subjectId) values(?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, teacher.getLastname());
            ps.setString(2,teacher.getFirstname());
            ps.setInt(3,teacher.getSubjectId());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }

    public Integer getId(Teacher teacher){
        final String sql = "select * from teacher where subjectId = ? AND lastname = ? AND firstname = ?";
        Teacher teacher1 = jdbcTemplate.queryForObject(sql,new TeacherMapper(),teacher.getSubjectId(),
                teacher.getLastname(),teacher.getFirstname());
        return teacher1.getTeacherId();
    }
}
