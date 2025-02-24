import services.HospitalService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalService hospitalService = new HospitalService();
        
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. View Patients");
            System.out.println("4. View Doctors");
            System.out.println("5. Remove Patient");
            System.out.println("6. Remove Doctor");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int pId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int pAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = scanner.nextLine();
                    hospitalService.addPatient(pId, pName, pAge, disease);
                    break;

                case 2:
                    System.out.print("Enter Doctor ID: ");
                    int dId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String dName = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    hospitalService.addDoctor(dId, dName, specialization);
                    break;

                case 3:
                    hospitalService.viewPatients();
                    break;

                case 4:
                    hospitalService.viewDoctors();
                    break;

                case 5:
                    System.out.print("Enter Patient ID to remove: ");
                    int removePId = scanner.nextInt();
                    hospitalService.removePatient(removePId);
                    break;

                case 6:
                    System.out.print("Enter Doctor ID to remove: ");
                    int removeDId = scanner.nextInt();
                    hospitalService.removeDoctor(removeDId);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
