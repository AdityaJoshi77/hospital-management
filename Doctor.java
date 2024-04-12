import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Employee 
{
    String department;
    String jobTitle;
    static int DoctorID_Gen = 100;
    ArrayList<Integer> PatientsAssignedToDoc = new ArrayList<>();
    private int DoctorID;
    String[] DocTypeDept = {"Rheumatology","Cardiology","Pediatric","ENT","Dentist"};
    String[] DocTypeJobTitle = {"Rheumatologist","Cardiologist","Pediatrician","ENT Specialist","Dentist"};

    int numberOfPatientsAssigned = 0;

    // Default Constructor
    public Doctor() throws IOException 
    {
        DoctorID = ++DoctorID_Gen;
        Scanner scan = new Scanner(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Select Doctor's Specialization:");
        System.out.println("1. Rheumatology");
        System.out.println("2. Cardiology");
        System.out.println("3. Pediatrician");
        System.out.println("4. ENT");
        System.out.println("5. Dentist");

        whileloop: while (true) 
        {
            int n = scan.nextInt();
            switch (n) 
            {
                case 1:
                    department  = DocTypeDept[0];
                    jobTitle = DocTypeJobTitle[0];
                    break whileloop;
                case 2:
                department  = DocTypeDept[1];
                jobTitle = DocTypeJobTitle[1];
                    break whileloop;  
                case 3:
                department  = DocTypeDept[2];
                jobTitle = DocTypeJobTitle[2];
                    break whileloop;  
                case 4:
                department  = DocTypeDept[3];
                jobTitle = DocTypeJobTitle[3];
                    break whileloop;  
                case 5:
                department  = DocTypeDept[4];
                jobTitle = DocTypeJobTitle[4];
                    break whileloop;
                default:
                System.out.println("Please select a valid option");
                    break;
            }    
        }
    
        // this.specialization = scan.nextLine();
        this.type = "Doctor";
        // numberOfPatientsAssigned++;
    }

    
    // Parameterized Constructor
    // Dummy data constructor
    public Doctor(int doctorID, String employeeName, String department, String jobTitle, int salary) throws IOException 
    {
        super(employeeName,salary, "Doctor");
        this.department = department;
        this.jobTitle = jobTitle;
        this.DoctorID = doctorID;
    }

    public int get_Id()
    {
        return this.DoctorID;
    }

    public void displayDoctor() 
    {
        this.displayEmployee(/*Dummy Val*/);
        System.out.println("Department: "+this.department);
        System.out.println("Job Title: "+this.jobTitle);
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
        this.displayPatientsAlloted();
    }

    public void displayDoctor(int dummy) 
    {
        this.displayEmployee(1/*Dummy Val*/);
        System.out.println("Department: "+this.department);
        System.out.println("Job Title: "+this.jobTitle);
        // System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }

    public void displayPatientsAlloted()
    {
        System.out.print("ID of patients allotted: ");
        for (Integer patID : this.PatientsAssignedToDoc) {
            System.out.print(patID + ", ");
        }
        System.out.println();
    }

    public void setNumberOfPatientsAssigned(int incDec) 
    {
        if (incDec == 1)
            this.numberOfPatientsAssigned++;            
        else
            this.numberOfPatientsAssigned--;
    }
}
