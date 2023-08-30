package CollectionAssignment.school;

public class Student extends SchoolManagement{

    private int studentID;
    private static int nextstudentID=1;

    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = nextstudentID++;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentID;
    }
}
