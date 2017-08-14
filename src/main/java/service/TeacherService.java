package service;

import dao.TeacherDao;
import model.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 22.07.2017.
 */
public class TeacherService {
    final TeacherDao teacherDao;
    @Autowired
    public TeacherService(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void addTeacher(Teacher teacher){
        teacherDao.add(teacher);
    }

    public Integer getId(Teacher teacher){
        return teacherDao.getId(teacher);
    }
}
