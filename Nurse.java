import java.io.IOError;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Nurse extends Employee {

    static int NurseID_Gen = 205;
    private int NurseID;
    ArrayList<Integer> PatientsAssignedToNur = new ArrayList<>();
    int numberOfPatientsAssigned = 0;

    public void setNumberOfPatientsAssigned(int incDec) 
    {
        if (incDec == 1)
        // If a patient is alloted to the ArrayList of the Nurse  (denoted by incDec == 1)
        // numberOfPatientsAssigned is incremented.
            this.numberOfPatientsAssigned++; 
        else
        // If a patient is removed from the ArrayList of the Nurse (denoted by incDec == 0)
        // numberOfPatientsAssigned is decremented.
            this.numberOfPatientsAssigned--;
    }

    public int getNumberOfPatientsAssigned() 
    {
        return numberOfPatientsAssigned;
    }

    public Nurse() throws IOException 
    {
        NurseID = ++NurseID_Gen;
        type = "Nurse";
        numberOfPatientsAssigned++;
    }

    // Dummy data constructor
    public Nurse(int nurseID, String employeeName,int salary) throws IOException 
    {
        super(employeeName, salary, "Nurse");
        this.NurseID = nurseID;
        this.salary = salary;
    }

    public int get_Id()
    {
        return this.NurseID;
    }

    
    public void displayNurseTabular() 
    {
        this.displayEmployeeTabular();
        System.out.printf("| %-3s |", this.get_Id());
        System.out.printf("| %-23s |", this.numberOfPatientsAssigned);
        this.displayPatientsAllotedTabular();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }

    
    // function for printing single nurse
    public void displayNurse() 
    {
        this.displayEmployee();
        System.out.println("Nurse ID: "+get_Id());
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
        this.displayPatientsAlloted();
    }

    public void displayNurse(int dummy) 
    {   
        // Overloaded to print only the relevant details while fetching the patient's complete record.
        this.displayEmployee(1 /*dummy val*/);
    }

    
    public void displayPatientsAllotedTabular()
    {
        // Displays the IDs of the patients in the PatientsAssignedToNur 
        // ArrayList of the Nurse.
        for (Integer patID : this.PatientsAssignedToNur) {
            System.out.printf("| %-1s", patID);
        }
        System.out.println();
    }

    public void displayPatientsAlloted()
    {
        // Displays the IDs of the patients in the PatientsAssignedToNur 
        // ArrayList of the Nurse.
        System.out.print("ID of patients allotted: ");
        for (Integer patID : this.PatientsAssignedToNur) {
            System.out.print(patID + ", ");
        }
        System.out.println();
    }
}
