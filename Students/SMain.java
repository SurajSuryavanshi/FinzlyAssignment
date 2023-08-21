package Students;

public class SMain {
    public static void main(String[] args){
        Student student1=new Student();
        Student student2=new Student("Sai",16);
        Student student3=new Student(21);



        student1.displayStudentInformation();
        student2.displayStudentInformation();
        student3.displayStudentInformation();

    }
}
