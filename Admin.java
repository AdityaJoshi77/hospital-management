import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Admin {

    
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice : ");
        System.out.println("1. Patients.");
        System.out.println("2. Doctors.");
        System.out.println("3. Nurses.");

        int choice  = scan.nextInt();
        switch(choice)
        {
            case 1:
            {   
                System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Patient.");
                System.out.println("2. Remove Patient.");
                System.out.println("3. Print Medical Report Of Patient.");
                int choice1 = scan.nextInt();
                switch (choice1) 
                {
                    case 1:
                        Patient p1 = new Patient();
                        System.out.println("Details you entered: ");
                        p1.displayPatient();
                        break;
                
                    default:
                    System.out.println("Enter Valid Choice.");
                        break;
                }
                break;
            }
            case 2:
            {
            System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Doctor.");
                System.out.println("2. Remove Doctor.");
                int choice2 = scan.nextInt();
                switch (choice2) {
                    case 1:
                        Doctor d1 = new Doctor();
                        System.out.println("\n\nDetails you entered: ");
                        d1.displayEmployee();
                        d1.displayDoctor();
                        break;

                    default:
                    System.out.println("Enter Valid Choice.");
                    break;
                }
                break;       
            }
            case 3:
            System.out.println("\nEnter your choice : ");
                System.out.println("1. Add Nurse.");
                System.out.println("2. Remove Nurse.");
                int choice3 = scan.nextInt();
                switch (choice3) {
                    case 1:
                        Nurse n1 = new Nurse();
                        System.out.println("\nDetails you entered: ");
                        n1.displayEmployee();
                        n1.displayNurse();
                        break;
                
                    default:
                    System.out.println("Enter Valid Choice.");
                    break;
            }
        }
    }
}
