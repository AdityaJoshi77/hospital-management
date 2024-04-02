import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DatabaseMetaData;
import java.io.IOException;

public class Admin {

    public static void main(String[] args) throws IOException {
        DataBase dat = new DataBase();

        // DUMMY DATA
        // -------------------------------------------------------------------------------------------

        // Adding dummy data for patients
        Patient patient1 = new Patient(101, "Anjali Gupta", "1234567890", "123, Main Street, City", "O+", "Female", 35);
        dat.patData.add(patient1);

        Patient patient2 = new Patient(102, "Amit Singh", "9876543210", "456, Second Avenue, Town", "A-", "Male", 45);
        dat.patData.add(patient2);

        Patient patient3 = new Patient(103, "Priya Sharma", "9998887776", "789, Third Road, Village", "B+", "Female",
                25);
        dat.patData.add(patient3);

        Patient patient4 = new Patient(104, "Rahul Kapoor", "8887776665", "101, Fourth Lane, Countryside", "AB-",
                "Male", 55);
        dat.patData.add(patient4);

        Patient patient5 = new Patient(105, "Neha Patel", "6665554443", "678, Fifth Street, Suburb", "O-", "Female",
                30);
        dat.patData.add(patient5);

        // Adding dummy data for doctors
        Doctor doctor1 = new Doctor(101, "Dr. Rajesh Kumar", 1001, "Cardiology", "Cardiologist", 150000, "Heart");
        dat.docData.add(doctor1);

        Doctor doctor2 = new Doctor(102, "Dr. Priya Patel", 1002, "Orthopedics", "Orthopedic Surgeon", 140000,
                "Bone Fractures");
        dat.docData.add(doctor2);

        Doctor doctor3 = new Doctor(103, "Dr. Amit Sharma", 1003, "Gynecology", "Gynecologist", 130000, "Obstetrics");
        dat.docData.add(doctor3);

        // Adding dummy data for nurses
        Nurse nurse1 = new Nurse(201, "Nurse Sunita Verma", 2001, "ICU", "Registered Nurse", 80000);
        dat.nurData.add(nurse1);

        Nurse nurse2 = new Nurse(202, "Nurse Sanjay Mishra", 2002, "Pediatrics", "Pediatric Nurse", 75000);
        dat.nurData.add(nurse2);

        Nurse nurse3 = new Nurse(203, "Nurse Meera Patel", 2003, "Emergency", "Emergency Nurse", 85000);
        dat.nurData.add(nurse3);

        // -------------------------------------------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        System.out.println("1. Patients.");
        System.out.println("2. Doctors.");
        System.out.println("3. Nurses.");

        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Patient.");
                System.out.println("2. Remove Patient.");
                System.out.println("3. Print Medical Report Of Patient.");
                int choice1 = scan.nextInt();
                switch (choice1) {
                    case 1:
                        Patient p1 = new Patient();
                        dat.patData.add(p1);
                        System.out.println("Details you entered: ");
                        p1.displayPatient();
                        break;

                    case 2:
                        System.out.println("Enter Patient ID: ");

                    default:
                        System.out.println("Enter Valid Choice.");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Doctor.");
                System.out.println("2. Remove Doctor.");
                int choice2 = scan.nextInt();
                switch (choice2) {
                    case 1:
                        Doctor d1 = new Doctor();
                        dat.docData.add(d1);
                        System.out.println("\n\nDetails you entered: ");
                        d1.displayEmployee();
                        d1.displayDoctor();
                        break;

                    case 2:
                        System.out.println("Enter Doctor ID: ");

                    default:
                        System.out.println("Enter Valid Choice.");
                        break;
                }
                break;
            }
            case 3:
                System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Nurse.");
                System.out.println("2. Remove Nurse.");
                int choice3 = scan.nextInt();
                switch (choice3) {
                    case 1:
                        Nurse n1 = new Nurse();
                        dat.nurData.add(n1);
                        System.out.println("\nDetails you entered: ");
                        n1.displayEmployee();
                        n1.displayNurse();
                        break;

                    case 2:
                        System.out.println("Enter Nurse ID: ");

                    default:
                        System.out.println("Enter Valid Choice.");
                        break;
                }
        }
    }
}
