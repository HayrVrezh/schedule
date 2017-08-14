package main;

import model.entity.Class_schedule;
import model.entity.Classs;
import model.entity.Student;
import model.entity.Teacher;
import service.*;

import java.util.Scanner;

/**
 * Created by Администратор on 21.07.2017.
 */
public class Main {
    public static ClassService classService;
    public static Class_scheduleService class_scheduleService;
    public static TeacherService teacherService;
    public static StudentService studentService;
    public static SubjectService subjectService;
    public static Classs classs;
    public static Class_schedule class_schedule;
    public static Student student;
    public static Teacher teacher;
    /*@Autowired
    public Main(MainController mainController) {
        this.mainController = mainController;
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'add' to add, and 'get' to get data");
            switch (scanner.next()) {
                case "add":
                 LOOP:   while(true) {
                    System.out.println("What data\n" +
                            "1-Class\n" +
                            "2-Student\n" +
                            "3-Teacher\n" +
                            "4-Schedule\n" +
                            "5-Change command");
                        switch (scanner.nextInt()) {
                            case 1:
                                System.out.println("Enter class");
                                classs = new Classs(scanner.nextInt());
                                System.out.println("1" + classs.getClasss());
                                classService.addClass(classs);
                                System.out.println("2");
                            case 2:
                                System.out.println("Enter student lastname, firstname, age, city and class");
                                String lastname = scanner.next();
                                String firstname = scanner.next();
                                Integer age = scanner.nextInt();
                                String city = scanner.next();
                                Integer classId = classService.getId(scanner.nextInt());
                                student = new Student(lastname,firstname,age,city,classId);
                                studentService.addStudent(student);
                                System.out.println("student added");
                            case 3:
                                System.out.println("Enter teacher lastname, firstname and subject");
                                lastname = scanner.next();
                                firstname = scanner.next();
                                Integer subjectId = subjectService.getId(scanner.next());
                                teacher = new Teacher(lastname,firstname,subjectId);
                                teacherService.addTeacher(teacher);
                            case 4:
                                System.out.println("Enter class and number of lessons");
                                classId = classService.getId(scanner.nextInt());
                                Integer quantity = scanner.nextInt();
                                System.out.println("Enter teacher lastname, firstname and subject");
                                for (int i=0;i<quantity;++i) {
                                    lastname = scanner.next();
                                    firstname = scanner.next();
                                    subjectId = subjectService.getId(scanner.next());
                                    teacher = new Teacher(lastname,firstname,subjectId);
                                    Integer teacherId = teacherService.getId(teacher);
                                    class_schedule = new Class_schedule(classId,i+1,teacherId,subjectId);
                                    class_scheduleService.addClass_schedule(class_schedule);
                                }
                            case 5: break LOOP;
                            default:
                                System.out.println("Enter command again");
                        }
                    }
                case "get":
                 LOOP:   while (true){
                     System.out.println("What data?\n" +
                             "1-Student's class\n" +
                             "2-Class schedule\n" +
                             "3-Subject and teacher by student and lesson\n" +
                             "4-Subject and teacher by class and lesson\n" +
                             "5-Change command");
                     switch (scanner.nextInt()){
                         case 1:
                             System.out.println("Enter student lastname and firstname");
                             student = new Student(scanner.next(),scanner.next());
                             System.out.println(classService.getClass(student));
                         case 2:
                             System.out.println("Enter class");
                             Integer classId = classService.getId(scanner.nextInt());
                             //toDo
                         case 3:
                             System.out.println("Enter student and lesson");
                             //toDo
                         case 4:
                             System.out.println("Enter class and lesson");
                             classId = classService.getId(scanner.nextInt());
                             Integer lesson = scanner.nextInt();
                         case 5:
                             default:
                                 System.out.println("Enter command again");
                     }
                    }
                    default:
                        System.out.println("Enter command again");
            }
        }
        }

}
