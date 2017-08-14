package model.entity;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Subject {
    Integer subjectId;
    String subject;

    public Subject(Integer subjectId, String subject) {
        this.subjectId = subjectId;
        this.subject = subject;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
