package service;

import dao.SubjectDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 22.07.2017.
 */
public class SubjectService {
    final SubjectDao subjectDao;
    @Autowired

    public SubjectService(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    public int getId(String subject){
        return subjectDao.getId(subject);
    }
}
