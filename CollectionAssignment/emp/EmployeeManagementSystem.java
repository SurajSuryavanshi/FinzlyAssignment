package CollectionAssignment.emp;

import CollectionAssignment.emp.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee Details");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Employee Salary: ");
                double salary = scanner.nextDouble();

                Employee newEmployee = new Employee(id, name, salary);
                employees.add(newEmployee);
                System.out.println("Employee added successfully!");
            } else if (choice == 2) {
                System.out.println("\nEmployee Details:");
                for (Employee emp : employees) {
                    System.out.println(emp);
                }
            } else if (choice == 3) {
                System.out.print("Enter Employee ID to search: ");
                int searchId = scanner.nextInt();
                boolean found = false;

                for (Employee emp : employees) {
                    if (emp.getId() == searchId) {
                        System.out.println("\nEmployee Found:");
                        System.out.println(emp);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee with ID " + searchId + " not found.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting Employee Management System. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}

