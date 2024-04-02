import java.io.IOError;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Nurse extends Employee {

    static int NurseID_Gen = 100;
    private int NurseID;

    ArrayList<Integer> PatientsAssignedToNur = new ArrayList<>();

    int numberOfPatientsAssigned = 0;

    void setNumberOfPatientsAssigned() {
        numberOfPatientsAssigned++;
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
    public Nurse(int nurseID, String employeeName, int employeeID, String department, String jobTitle, int salary)
            throws IOException 
    {
        super(employeeName, employeeID, department, jobTitle, salary, "Nurse");
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
    }
}
