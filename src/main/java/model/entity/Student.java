package model.entity;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Student {
    Integer studentId;
    String lastname;
    String firstname;
    Integer age;
    String city;
    Integer classId;

    public Student(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Student(Integer studentId, String lastname, String firstname, Integer age, String city, Integer classId) {
        this.studentId = studentId;
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.city = city;
        this.classId = classId;
    }

    public Student(String lastname, String firstname, Integer age, String city, Integer classId) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.city = city;
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
