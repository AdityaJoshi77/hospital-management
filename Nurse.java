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
            throws IOException {
        this.NurseID = nurseID;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void displayNurse() {
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }
}
