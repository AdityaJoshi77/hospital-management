public class Employee {
    int employeeID;
    String department;
    String jobTitle;
    int Salary;

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getSalary() {
        return Salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    // Reserved For Admin Class
    // public static void main(String[] args) {
    // System.out.println("Enter Employee Details: ");
    // System.out.println("Choose Employe:\n1: Doctor\n2: Nurse");
    // Scanner scan = new Scanner(System.in);
    // int n = scan.nextInt();
    // switch (n) {
    // case 1:
    // Doctor d = new Employee();

    // break;

    // case 2:
    // Nurse ns = new Nurse();
    // break;

    // default:
    // System.out.println("Wrong input.");
    // break;
    // }
    // scan.close();
    // }
}
