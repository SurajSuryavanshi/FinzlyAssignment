package Test1;

import javax.naming.Name;

public class Student {
    String StudentID;
    String Name;
    static int totalStudents;
    public Student(String StudentID,String Name){
        this.StudentID=StudentID;
        this.Name=Name;
        totalStudents++;

    }
    public void dropStudent(){
        totalStudents--;
    }
    public static int getTotalStudents(){
        return totalStudents;
    }


    public static void main(String[] agrs){
        Student s1=new Student("1212","Ram");
        System.out.println("Name of student : "+s1.Name+" & Id : "+ s1.StudentID);
        Student s2=new Student("2121","Sai");
        System.out.println("Name of student : "+s2.Name+" & ID : "+s2.StudentID);
        System.out.println("Number of Student present "+Student.getTotalStudents());
        s1.dropStudent();
        System.out.println("Number of Student present after dropping "+Student.getTotalStudents());

    }
}
