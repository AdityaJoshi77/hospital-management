import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeID;
    String department;
    String jobTitle;
    int salary;
    String type;

    
    public Employee() throws IOException
    {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
    

        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEmployee's Name: ");
        // employeeName = scan.nextLine();
        employeeName = bfr.readLine();
  


        System.out.print("Employee ID: ");
        employeeID = scan.nextInt();

        System.out.print("Department: ");
        // department = scan.nextLine();
        department = bfr.readLine();


        System.out.print("Job Title: ");
        // jobTitle = scan.nextLine();
        jobTitle = bfr.readLine();

            
        System.out.print("Salary: ");
        salary = scan.nextInt();
    }

    public void displayEmployee()
    {
        System.out.println("FULL NAME: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Job Title: "  + jobTitle);
        System.out.println("Salary: " + salary);
    }
}
