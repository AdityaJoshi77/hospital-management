import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Employee {

    static int DoctorID_Gen = 100;
    ArrayList<Integer> PatientsAssignedToDoc = new ArrayList<>();
    private int DoctorID;
    String specialization;

    int numberOfPatientsAssigned = 0;

    public Doctor() throws IOException {
        DoctorID = ++DoctorID_Gen;
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        // String name = bfr.readLine();
        // System.out.println(name);

        // Scanner scan = new Scanner(System.in);

        System.out.print("Doctor's Specialization: ");
        // this.specialization = scan.nextLine();
        specialization = bfr.readLine();
        this.type = "Doctor";
        numberOfPatientsAssigned++;
    }

    // Dummy data constructor
    public Doctor(int doctorID, String employeeName, int employeeID, String department, String jobTitle, int salary,
            String specialization) throws IOException {
        this.DoctorID = doctorID;
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("Specialization: " + specialization);
        System.out.println("Number of Patients Assigned: " + numberOfPatientsAssigned);
    }
}
