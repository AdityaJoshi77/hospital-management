import java.io.IOError;
import java.io.IOException;
import java.io.InvalidObjectException;

public class Nurse extends Employee {

     int numberOfPatientsAssigned = 0;

    void setNumberOfPatientsAssigned() {
        numberOfPatientsAssigned++;
    }

    public int getNumberOfPatientsAssigned() {
        return numberOfPatientsAssigned;
    }

        
    public Nurse() throws IOException
    {
        type = "Nurse";
        numberOfPatientsAssigned++;
    }
    public void displayNurse()
    {
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }
}
