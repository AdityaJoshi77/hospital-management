import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeID;
    int salary;
    String type;

    public Employee() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEmployee's Name: ");
        // employeeName = scan.nextLine();
        employeeName = bfr.readLine();

        System.out.print("Employee ID: ");
        employeeID = scan.nextInt();

        System.out.print("Salary: ");
        salary = scan.nextInt();
    }

    // dummy data constructor
    public Employee(String employeeName, int employeeID, int salary, String type) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.salary = salary;
        this.type = type;
    }

    public void displayEmployee() {
        System.out.println("FULL NAME: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}
