package Employees;

public class Employee {
    private int ID;
    private static int nextID=1;
    private String name;
    public Employee(int ID,String name){
        this.ID=nextID++;
        this.name=name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;

    }
}
