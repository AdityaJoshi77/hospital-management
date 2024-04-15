import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee 
{
    String employeeName;
    int salary;
    String type;

    public Employee() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);

        System.out.print("\nEmployee's Name: ");
        // employeeName = scan.nextLine();
        employeeName = bfr.readLine();

        System.out.print("Salary: ");
        salary = scan.nextInt();
    }

    // dummy data constructor
    public Employee(String employeeName, int salary, String type) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.type = type;
    }

    public void displayEmployee() 
    {
        System.out.println("FULL NAME: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public void displayEmployee(int dummy) 
    {
        System.out.println("FULL NAME: " + employeeName);
    }
}
