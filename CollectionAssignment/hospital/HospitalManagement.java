package CollectionAssignment.hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HospitalManagement {
        public static void main(String[] args) {

            HashMap<Integer, Patient> patientsMap = new HashMap<>();
            Scanner scanner = new Scanner(System.in);
            int patientIDCounter = 1;

            while (true) {
                System.out.println("\nHospital Management System Menu:");
                System.out.println("1. Add Patient");
                System.out.println("2. Search for Patient by ID");
                System.out.println("3. List All Patients");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice == 1) {
                    System.out.print("Enter Patient Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Gender (male/female): ");
                    String gender = scanner.nextLine();

                    Patient newPatient = new Patient(name, age, gender);

                    patientsMap.put(patientIDCounter, newPatient);
                    System.out.println("Patient added successfully. Patient ID: " + patientIDCounter);
                    patientIDCounter++;

                } else if (choice == 2) {
                    System.out.print("Enter Patient ID to search: ");
                    int searchID = scanner.nextInt();

                    Patient patient = patientsMap.get(searchID);
                    if (patient != null) {
                        System.out.println("\nPatient Found:");
                        System.out.println(patient);
                    } else {
                        System.out.println("Patient with ID " + searchID + " not found.");
                    }
                } else if (choice == 3) {
                    System.out.println("\nAll Patients:");
                    for (Map.Entry<Integer, Patient> entry : patientsMap.entrySet()) {
                        System.out.println("Patient ID: " + entry.getKey());
                        System.out.println(entry.getValue());
                    }
                } else if (choice == 4) {
                    System.out.println("Exiting Hospital Management System. Goodbye!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        }
    }
