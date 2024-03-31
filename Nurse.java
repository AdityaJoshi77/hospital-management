public class Nurse extends Employee {

     int numberOfPatientsAssigned = 0;

    void setNumberOfPatientsAssigned() {
        numberOfPatientsAssigned++;
    }

    public int getNumberOfPatientsAssigned() {
        return numberOfPatientsAssigned;
    }

        
    public Nurse()
    {
        type = "Nurse";
        numberOfPatientsAssigned++;
    }
    public void displayNurse()
    {
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }
}
