package model.entity;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Teacher {
    Integer teacherId;
    String lastname;
    String firstname;
    Integer subjectId;

    public Teacher(Integer teacherId, String lastname, String firstname, Integer subjectId) {
        this.teacherId = teacherId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.subjectId = subjectId;
    }

    public Teacher(String lastname, String firstname, Integer subjectId) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.subjectId = subjectId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}
