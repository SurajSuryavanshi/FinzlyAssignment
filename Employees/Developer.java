package Employees;
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int ID,String name, String programmingLanguage){
        super(ID,name);
        this.programmingLanguage=programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
