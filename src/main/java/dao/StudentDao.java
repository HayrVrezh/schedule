package dao;

import model.entity.Student;
import model.entity.Teacher;
import model.mapper.StudentMapper;
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
public class StudentDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public StudentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int add(Student student){
        final String sql = "insert into student(lastname,firstname,age,city,classId) values(?,?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getLastname());
            ps.setString(2,student.getFirstname());
            ps.setInt(3,student.getAge());
            ps.setString(4,student.getCity());
            ps.setInt(5,student.getClassId());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }
    public Integer getClassId(Student student){
        final String sql = "select * from student where lastname = ? AND firstname = ?";
        Student student1 = jdbcTemplate.queryForObject(sql,new StudentMapper(),student.getLastname(),
                student.getFirstname());
        return student1.getClassId();
    }
}
