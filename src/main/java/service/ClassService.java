package service;

import dao.ClassDao;
import dao.StudentDao;
import model.entity.Classs;
import model.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 22.07.2017.
 */
public class ClassService {
    final ClassDao classDao;
    final StudentDao studentDao;
    @Autowired
    public ClassService(ClassDao classDao, StudentDao studentDao) {
        this.classDao = classDao;
        this.studentDao = studentDao;
    }



    public void addClass(Classs classs){
        System.out.println("3");
        classDao.add(classs);
    }
    public Integer getId(Integer clazz){
        return classDao.getId(clazz);
    }

    public Integer getClass(Student student){
        return classDao.getClasss(studentDao.getClassId(student));
    }
}
