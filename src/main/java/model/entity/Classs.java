package model.entity;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Classs {
    Integer classId = 0;
    Integer clazz = 0;

    public Classs(Integer classId, Integer classs) {
        this.classId = classId;
        this.clazz = classs;
    }

    public Classs(Integer clazz) {
        this.clazz = clazz;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getClasss() {
        return clazz;
    }

    public void setClasss(Integer classs) {
        this.clazz = classs;
    }
}
