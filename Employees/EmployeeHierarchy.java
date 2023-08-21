package Employees;

import java.util.Scanner;

public class EmployeeHierarchy {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter manager name");
        String managerName=scanner.nextLine();
        System.out.println("Enter manager id :");
        int managerId=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter manager department");
        String managerDepartment=scanner.nextLine();

        System.out.println("Enter developer name ");
        String developerName=scanner.nextLine();
        System.out.println("Enter manager id :");
        int developerId=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter developer programming Language");
        String programmingLanguage=scanner.nextLine();

        Manager manager=new Manager(managerId,managerName,managerDepartment);
        Developer developer=new Developer(developerId,developerName,programmingLanguage);

        System.out.println("Manger Details :");
        System.out.println("Name :"+manager.getName());
        System.out.println("ID"+manager.getID());
        System.out.println("Department :"+manager.getDepartment());


        System.out.println("Developer Details :");
        System.out.println("Name :"+developer.getName());
        System.out.println("ID"+developer.getID());
        System.out.println("Programming Language :"+developer.getProgrammingLanguage());


        scanner.close();
    }



}
