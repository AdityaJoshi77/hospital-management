import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Admin 
{
    public static void main(String[] args) throws IOException 
    {
        DataBase dat = new DataBase();
        dat.initiateDatabase();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n\n----------------- ADMIN PANEL ------------------");
            System.out.println("Enter your choice : ");
            System.out.println("1. Patient Records.");
            System.out.println("2. Doctor Records.");
            System.out.println("3. Nurse Records.");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            int choice = scan.nextInt();
            switch (choice) 
            {
                case 1: 
                {
                    System.out.println("\n------------------ PATIENTS -------------------");
                    System.out.println("1. Add Patient.");
                    System.out.println("2. Remove Patient.");
                    System.out.println("3. Search Patient");
                    System.out.println("4. View All Patients");
                    System.out.println("5. Print Medical Report Of Patient.");
                    System.out.print("Enter Choice: ");
                    int choice1 = scan.nextInt();
                    switch (choice1) 
                    {
                        case 1:
                            // Adding Patient    

                            Patient p1 = new Patient(dat);
                            dat.patData.add(p1);
                            System.out.println("\n\t\tDetails you entered: ");
                            p1.displayPatient();
                            break;

                        case 2:
                            // Removing Patient

                            {System.out.print("Enter the ID of the Patient : ");
                            int searchID = scan.nextInt();
                            dat.removePatient(searchID);
                            break;}

                        case 3:
                            // Searching Patient

                            {System.out.print("Enter Patient ID: ");
                            int searchID = scan.nextInt();
                            System.out.println("\nFetching Patient....................... \n");
                            dat.searchPatient(searchID);
                            break;}
                        
                        case 4:
                            // Display All Patients
                            dat.displayAllPatients();
                            break;
                        
                        case 5:
                        {
                            // Printing Patient Record.
                            System.out.print("Enter ID of the Patient for the Medical Record:");
                            int enterID = scan.nextInt();
                            Patient foundPatient = dat.getPatient(enterID);
                            foundPatient.getPatientReport(dat);
                            break;
                        }
                        default:
                            System.out.println("Enter Valid Choice.");
                            break;
                    }
                    break;
                }
              
                case 2: 
                {
                    System.out.println("\n------------------ DOCTORS -------------------");
                    System.out.println("1. Add Doctor.");
                    System.out.println("2. Remove Doctor.");
                    System.out.println("3. Search Doctor");
                    System.out.println("4. View All Doctors");
                    System.out.print("Enter Choice: ");
                    int choice2 = scan.nextInt();
                    switch (choice2) 
                    {
                        case 1:
                            // Adding Doctor
                            {Doctor d1 = new Doctor();
                            dat.docData.add(d1);
                            System.out.println("Doctor added successfully...");
                            // System.out.println("\n\nDetails you entered: ");
                            // d1.displayDoctor();
                            break;}
                        case 2:
                        {System.out.print("Enter the ID of the Doctor : ");
                            int searchID = scan.nextInt();
                            dat.removeDoctor(searchID);
                            break;}

                        case 3:
                            System.out.print("Enter Doctor ID: ");
                            int searchID = scan.nextInt();
                            System.out.println("\nFetching Doctor.................. \n");
                            dat.searchDoctor(searchID);
                            break;

                        case 4:
                            dat.displayAllDoctors();
                            break;

                        default:
                            System.out.println("Enter Valid Choice.");
                            break;
                    }
                    break;
                }
    
                case 3:
                System.out.println("\n----------------- NURSES -------------------");
                    System.out.println("1. Add Nurse.");
                    System.out.println("2. Remove Nurse.");
                    System.out.println("3. Search Nurse");
                    System.out.println("4. View All Nurses");
                    System.out.print("Enter Choice: ");
                    int choice3 = scan.nextInt();
                    switch (choice3) 
                    {
                        case 1:
                            Nurse n1 = new Nurse();
                            dat.nurData.add(n1);
                            System.out.println("\n\t\tDetails you entered: ");
                            n1.displayEmployee();
                            n1.displayNurse();
                            break;
                        case 2:
                        {System.out.print("Enter the ID of the Nurse : ");
                            int searchID = scan.nextInt();
                            dat.removeNurse(searchID);
                            break;}
                        case 3:
                            System.out.print("Enter Nurse ID: ");
                            int searchID = scan.nextInt();
                            System.out.println("\nFetching Nurse....................... \n");
                            dat.searchNurse(searchID);
                            break;

                        case 4:
                            dat.displayAllNurses();
                            break;

                        default:
                            System.out.println("Enter Valid Choice.");
                            break;
                    }
                break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
