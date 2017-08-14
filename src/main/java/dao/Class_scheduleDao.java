package dao;

import model.entity.Class_schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;

/**
 * Created by Администратор on 21.07.2017.
 */
@Repository
public class Class_scheduleDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public Class_scheduleDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int add(Class_schedule class_schedule){
        final String sql = "insert into class_schedule(classId,lesson,teacherId,subjectId) values(?,?,?,?)";
        GeneratedKeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,class_schedule.getClassId());
            ps.setInt(2,class_schedule.getLesson());
            ps.setInt(3,class_schedule.getTeacherId());
            ps.setInt(4,class_schedule.getSubjectId());
            return ps;
        }, holder);

        return (int) holder.getKey().longValue();
    }
}
