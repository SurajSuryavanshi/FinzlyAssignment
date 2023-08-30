package CollectionAssignment.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProjectManagement {
    public static void main(String[] args) {
        Map<String, Projects> projectsMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nProject Management System Menu:");
            System.out.println("1. Add Project");
            System.out.println("2. Assign Team Member to Project");
            System.out.println("3. View Project Details");
            System.out.println("4. List All Projects");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Project Name: ");
                String projectName = scanner.nextLine();
                System.out.print("Enter Project Description: ");
                String projectDescription = scanner.nextLine();

                Projects newProject = new Projects(projectName, projectDescription);
                projectsMap.put(projectName, newProject);
                System.out.println("Project added successfully!");
            } else if (choice == 2) {
                System.out.print("Enter Project Name: ");
                String projectName = scanner.nextLine();
                Projects project = projectsMap.get(projectName);

                if (project != null) {
                    System.out.print("Enter Team Member Name: ");
                    String teamMember = scanner.nextLine();
                    project.addTeamMember(teamMember);
                    System.out.println("Team member added to the project.");
                } else {
                    System.out.println("Project with the provided name not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter Project Name: ");
                String projectName = scanner.nextLine();
                Projects project = projectsMap.get(projectName);

                if (project != null) {
                    System.out.println("\nProject Details:");
                    System.out.println(project);
                } else {
                    System.out.println("Project with the provided name not found.");
                }
            } else if (choice == 4) {
                System.out.println("\nAll Projects:");
                for (Projects project : projectsMap.values()) {
                    System.out.println(project);
                }
            } else if (choice == 5) {
                System.out.println("Exiting Project Management System. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
