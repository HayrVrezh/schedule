package service;

import dao.Class_scheduleDao;
import model.entity.Class_schedule;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 22.07.2017.
 */
public class Class_scheduleService {
    final Class_scheduleDao class_scheduleDao;
    @Autowired
    public Class_scheduleService(Class_scheduleDao class_scheduleDao) {
        this.class_scheduleDao = class_scheduleDao;
    }

    public void addClass_schedule(Class_schedule class_schedule){
        class_scheduleDao.add(class_schedule);
    }
}
