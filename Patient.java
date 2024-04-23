import java.util.*;

import javax.print.Doc;

public class Patient {
    static int PatientID_Gen = 305;
    private int PatientID;
    private int allottedDoctorID;
    private int allottedNurseID;
    private String PatientName;
    private String Contact_No;
    private String Address;
    private String BloodGroup;
    private String Gender;
    String[] DepartmentConcernedList = { "Rheumatology", "Cardiology", "Pediatry", "ENT", "Dental"};
    private String DepartmentConcerned;
    private int Age;

    public Patient(DataBase dat) {
        PatientID = ++PatientID_Gen;

        Scanner scan = new Scanner(System.in);
        System.out.println("\n-------------- ADDING PATIENTS---------------");
        System.out.print("PATIENT'S NAME: ");
        PatientName = scan.nextLine();

        System.out.print("GENDER: ");
        Gender = scan.nextLine();

        System.out.println("\nSelect Nature of Illness:");
        System.out.println("1. Joint-Pain Issues");
        System.out.println("2. Cardiac Issues");
        System.out.println("3. Dietary Issues");
        System.out.println("4. ENT Issues");
        System.out.println("5. Dental Issues\n");

        whileloop: while (true) {
            System.out.print("Enter Choice: ");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    DepartmentConcerned = DepartmentConcernedList[0];
                    break whileloop;
                case 2:
                    DepartmentConcerned = DepartmentConcernedList[1];
                    break whileloop;
                case 3:
                    DepartmentConcerned = DepartmentConcernedList[2];
                    break whileloop;
                case 4:
                    DepartmentConcerned = DepartmentConcernedList[3];
                    break whileloop;
                case 5:
                    DepartmentConcerned = DepartmentConcernedList[4];
                    break whileloop;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }

        // Alloting Doctor to the Patient.
        this.allot_Doctor(dat);

        // Alloting Nurse to the Patient.
        this.allot_Nurse(dat);

        System.out.print("\nCONTACT NUMBER: ");
        scan.nextLine(); // To clear the buffer.
        Contact_No = scan.nextLine();

        System.out.print("BLOOD GROUP else NA: ");
        BloodGroup = scan.nextLine();

        System.out.print("ADDRESS: ");
        Address = scan.nextLine();

        System.out.print("AGE: ");
        Age = scan.nextInt();

    }

    // Dummy data constructor
    public Patient(int PatientID, String PatientName, String Contact_No, String Address, String BloodGroup,
            String Gender, int Age, String DepartmentConcerned, int allottedDoctorID, int allottedNurseID) {
        this.PatientID = PatientID;
        this.PatientName = PatientName;
        this.Contact_No = Contact_No;
        this.Address = Address;
        this.BloodGroup = BloodGroup;
        this.Gender = Gender;
        this.Age = Age;
        this.DepartmentConcerned = DepartmentConcerned;
        this.allottedDoctorID = allottedDoctorID;
        this.allottedNurseID = allottedNurseID;
    }

    public int get_Id() {
        return this.PatientID;
    }

    public void allot_Doctor(DataBase dat) {
        // the allot_Nurse() function (belonging to the Patient Class) and the
        // assign_Nurse() function (belonging to the Doctor Class) act as interface
        // between the Patient Class and the DataBase Class
        // for the purpose of information exchange.

        this.allottedDoctorID = dat.assign_Doctor(this.DepartmentConcerned, this.get_Id());
    }

    public int getAllotedDoctor() {
        return this.allottedDoctorID;
    }

    public void allot_Nurse(DataBase dat) {
        // the allot_Nurse() function (belonging to the Patient Class) and the
        // assign_Nurse() function (belonging to the Doctor Class) act as interface
        // between the Patient Class and the DataBase Class
        // for the purpose of information exchange.

        this.allottedNurseID = dat.assign_Nurse(this.get_Id());
    }

    public int getAllotedNurse() {
        return this.allottedNurseID;
    }

    public void getPatientReport(DataBase dat) {
        this.displayPatient();
        // now displaying details of the doctor alloted
        Iterator<Doctor> iterator = dat.docData.iterator();
        while (iterator.hasNext()) {
            Doctor doc = iterator.next();
            if (doc.get_Id() == this.allottedDoctorID) {
                System.out.println("\nDoctor Alloted: ");
                doc.displayDoctor(1);
                break;
            }
        }
        // now displaying details of the nurse alloted
        Iterator<Nurse> iterator2 = dat.nurData.iterator();
        while (iterator2.hasNext()) {
            Nurse nur = iterator2.next();
            if (nur.get_Id() == this.allottedNurseID) {
                System.out.println("\nNurse Alloted: ");
                nur.displayNurse(1);
                break;
            }
        }
    }

    public void displayPatient(int dummy) {
        // System.out.println("-------------------------------------------------------------");
        // System.out.println("|                    Patient Details                         |");
        // System.out.println("-------------------------------------------------------------");

        // Print field names
        // System.out.printf("| %-1s |", "Field");
        // System.out.println("-------------------------------------------------------------");
        
        // System.out.println("-------------------------------------------------------------");

        // Print corresponding values
        // System.out.printf("| %-1s |", "Value");
        // System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-3s |", this.PatientID);
        System.out.printf("| %-12s |", this.PatientName);
        System.out.printf("| %-1s |", this.Contact_No);
        System.out.printf("| %-4s |", this.BloodGroup);
        System.out.printf("| %-7s |", this.Gender);
        System.out.printf("| %-30s |", this.Address);
        System.out.printf("| %-1s |", this.Age);
        System.out.printf("| %-12s |", this.DepartmentConcerned);
        System.out.printf("| %-6s |", this.allottedDoctorID);
        System.out.printf("| %-6s |", this.allottedNurseID);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    // public void displayPatient() {
    // System.out.println("-------------------------------------------------------------");
    // System.out.println("| Patient Details |");
    // System.out.println("-------------------------------------------------------------");

    // // Print data members (fields) in the first row
    // System.out.printf("| %-20s | %-30s |\n", "Field", "Value");
    // System.out.println("-------------------------------------------------------------");

    // // Print values in the next row
    // System.out.printf("| %-20s | %-30s |\n", "Patient ID", PatientID);
    // System.out.printf("| %-20s | %-30s |\n", "FULL NAME", PatientName);
    // System.out.printf("| %-20s | %-30s |\n", "CONTACT NUMBER", Contact_No);
    // System.out.printf("| %-20s | %-30s |\n", "BLOOD GROUP", BloodGroup);
    // System.out.printf("| %-20s | %-30s |\n", "GENDER", Gender);
    // System.out.printf("| %-20s | %-30s |\n", "ADDRESS", Address);
    // System.out.printf("| %-20s | %-30s |\n", "AGE", Age);
    // System.out.printf("| %-20s | %-30s |\n", "Consulting Physician",
    // DepartmentConcerned);
    // System.out.printf("| %-20s | %-30s |\n", "Alloted Doctor ID",
    // allottedDoctorID);
    // System.out.printf("| %-20s | %-30s |\n", "Alloted Nurse ID",
    // allottedNurseID);
    // System.out.println("-------------------------------------------------------------");
    // }

    // public void displayPatient() {
    // System.out.println("-------------------------------------------------");
    // System.out.println("| Patient Details |");
    // System.out.println("-------------------------------------------------");
    // System.out.printf("| %-20s | %-30s |\n", "Patient ID:", PatientID);
    // System.out.printf("| %-20s | %-30s |\n", "FULL NAME:", PatientName);
    // System.out.printf("| %-20s | %-30s |\n", "CONTACT NUMBER:", Contact_No);
    // System.out.printf("| %-20s | %-30s |\n", "BLOOD GROUP:", BloodGroup);
    // System.out.printf("| %-20s | %-30s |\n", "GENDER:", Gender);
    // System.out.printf("| %-20s | %-30s |\n", "ADDRESS:", Address);
    // System.out.printf("| %-20s | %-30s |\n", "AGE:", Age);
    // System.out.printf("| %-20s | %-30s |\n", "Consulting Physician:",
    // DepartmentConcerned);
    // System.out.printf("| %-20s | %-30s |\n", "Alloted Doctor ID:",
    // allottedDoctorID);
    // System.out.printf("| %-20s | %-30s |\n", "Alloted Nurse ID:",
    // allottedNurseID);
    // System.out.println("-------------------------------------------------");
    // }

    // function for printing single patient
    public void displayPatient()
    {
    System.out.println("-------------------------------------------------");
    System.out.println("\t\tPatient ID: "+ PatientID);
    System.out.println("\nFULL NAME: " + PatientName);
    System.out.println("CONTACT NUMBER: " + Contact_No);
    System.out.println("BLOOD GROUP: " + BloodGroup);
    System.out.println("GENDER: " + Gender);
    System.out.println("ADDRESS: " + Address);
    System.out.println("AGE: " + Age);
    System.out.println("Consulting Physician: " + DepartmentConcerned);
    System.out.println("Alloted Doctor ID: "+ allottedDoctorID);
    System.out.println("Alloted Nurse ID: "+ allottedNurseID);
    }
}