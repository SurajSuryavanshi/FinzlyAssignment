package Students;

import java.util.UUID;

public class Student {
    private String name;
    private int age;
    private int studentID;
    private static int nextStudentID=1;

    Student(){
        this.name="Unknown";
        this.age=0;
        this.studentID=nextStudentID++;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        this.studentID=nextStudentID++;
    }


}
