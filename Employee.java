import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeID;
    String department;
    String jobTitle;
    int salary;
    String type;

    
    public Employee()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Employee'S NAME: ");
        employeeName = scan.nextLine();


        System.out.print("Employee ID: ");
        employeeID = scan.nextInt();

        System.out.print("Department: ");
        department = scan.nextLine();

        System.out.print("Job Title: ");
        jobTitle = scan.nextLine();
            
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
