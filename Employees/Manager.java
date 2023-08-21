package Employees;

public class Manager extends Employee{
    private String department;
   public Manager(int ID,String name,String department){
        super(ID,name);
        this.department=department;
    }
    public String getDepartment(){
       return department;
    }
}
