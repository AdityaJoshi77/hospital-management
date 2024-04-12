import java.io.IOError;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Nurse extends Employee {

    static int NurseID_Gen = 100;
    private int NurseID;

    ArrayList<Integer> PatientsAssignedToNur = new ArrayList<>();

    int numberOfPatientsAssigned = 0;

    void setNumberOfPatientsAssigned(int incDec) 
    {
        if (incDec == 1)
            this.numberOfPatientsAssigned++;            
        else
            this.numberOfPatientsAssigned--;
    }

    public int getNumberOfPatientsAssigned() {
        return numberOfPatientsAssigned;
    }

    public Nurse() throws IOException {
        NurseID = ++NurseID_Gen;
        type = "Nurse";
        numberOfPatientsAssigned++;
    }

    // Dummy data constructor
    public Nurse(int nurseID, String employeeName,int salary)
            throws IOException 
    {
        super(employeeName, salary, "Nurse");
        this.NurseID = nurseID;
        this.salary = salary;
    }

    public int get_Id()
    {
        return this.NurseID;
    }

    public void displayNurse() 
    {
        this.displayEmployee();
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
        this.displayPatientsAlloted();
    }

    public void displayNurse(int dummy) 
    {
        // For Patient Record
        this.displayEmployee(1 /*dummy val*/);
        // System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }

    
    public void displayPatientsAlloted()
    {
        System.out.print("ID of patients allotted: ");
        for (Integer patID : this.PatientsAssignedToNur) {
            System.out.print(patID + ", ");
        }
        System.out.println();
    }
}
