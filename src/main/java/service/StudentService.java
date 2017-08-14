package service;

import dao.ClassDao;
import dao.StudentDao;
import model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 22.07.2017.
 */
public class StudentService {
    final StudentDao studentDao;
    final ClassDao classDao;
    @Autowired
    public StudentService(StudentDao studentDao, ClassDao classDao) {
        this.studentDao = studentDao;
        this.classDao = classDao;
    }


    public void addStudent(Student student){
        studentDao.add(student);
    }

}
