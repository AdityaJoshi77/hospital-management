import java.util.Scanner;


public class Doctor extends Employee {

    String specialization;

     int numberOfPatientsAssigned = 0;

      
    public Doctor()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Doctor's Specialization: ");
        this.specialization = scan.nextLine();
        this.type = "Doctor";
        numberOfPatientsAssigned++;
    }
    public void displayDoctor()
    {
        System.out.println("Specialization: " + specialization);
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }
}
