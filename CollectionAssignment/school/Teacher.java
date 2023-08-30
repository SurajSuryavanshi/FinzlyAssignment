package CollectionAssignment.school;

public class Teacher extends SchoolManagement{
    private int employeeID;
    private static int nextEmployeeID=1;

    public Teacher(String name, int age, String employeeID) {
        super(name, age);
        this.employeeID = nextEmployeeID++;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return super.toString() + ", Employee ID: " + employeeID;
    }
}