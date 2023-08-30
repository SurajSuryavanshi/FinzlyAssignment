package CollectionAssignment.school;


import java.util.ArrayList;
import java.util.Scanner;
public class SchoolOperation {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSchool Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Display Students");
            System.out.println("4. Display Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Student Age: ");
                int age = scanner.nextInt();
                System.out.print("Enter Student ID: ");
                int studentID = scanner.nextInt();

                Student newStudent = new Student(name, age, studentID);
                students.add(newStudent);
                System.out.println("Student added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Teacher Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Teacher Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Teacher Employee ID: ");
                String employeeID = scanner.nextLine();

                Teacher newTeacher = new Teacher(name, age, employeeID);
                teachers.add(newTeacher);
                System.out.println("Teacher added successfully!");
            } else if (choice == 3) {
                System.out.println("\nStudent Details:");
                for (Student student : students) {
                    System.out.println(student);
                }
            } else if (choice == 4) {
                System.out.println("\nTeacher Details:");
                for (Teacher teacher : teachers) {
                    System.out.println(teacher);
                }
            } else if (choice == 5) {
                System.out.println("Exiting School Management System. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
