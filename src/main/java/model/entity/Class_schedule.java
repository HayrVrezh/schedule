package model.entity;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Class_schedule {
    Integer classId;
    Integer lesson;
    Integer teacherId;
    Integer subjectId;

    public Class_schedule(Integer classId, Integer lesson, Integer teacherId, Integer subjectId) {
        this.classId = classId;
        this.lesson = lesson;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getLesson() {
        return lesson;
    }

    public void setLesson(Integer lesson) {
        this.lesson = lesson;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}
