package CollectionAssignment.emp;

class Employee {
    private int id;
    private String name;
    private double salary;
    private static int employeeid=1;

    public Employee(int id, String name, double salary) {
        this.id = employeeid++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: $" + salary;
    }
}
