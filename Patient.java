    import java.util.*;
    public class Patient
    {
        static int PatientID_Gen = 100;
        private int PatientID;
        private String PatientName;
        private String Contact_No;
        private String Address;
        private String BloodGroup;
        private String Gender;
        private int Age;    

        public Patient()
        {
            PatientID = ++PatientID_Gen;

            Scanner scan = new Scanner(System.in);
            System.out.print("\nPATIENT'S NAME: ");
                PatientName = scan.nextLine();
                

            System.out.print("GENDER: ");
                Gender = scan.nextLine();

            System.out.print("CONTACT NUMBER: ");
                Contact_No = scan.nextLine();


            System.out.print("BLOOD GROUP: ");
            System.out.print("Enter the blood group if known, else enter NA : ");
                BloodGroup = scan.nextLine();

            System.out.print("ADDRESS: ");
                Address = scan.nextLine();

            System.out.print("AGE: ");
                Age = scan.nextInt();
            
        }


        // Dummy data constructor
        public Patient(int PatientID,String PatientName,String Contact_No,String Address,String BloodGroup,String Gender,int Age){
            this.PatientID = PatientID;
            this.PatientName = PatientName;
            this.Contact_No = Contact_No;
            this.Address = Address;
            this.BloodGroup = BloodGroup;
            this.Gender = Gender;
            this.Age = Age;
        }

        public void displayPatient()
        {
            System.out.println("Patient ID: "+ PatientID);
            System.out.println("FULL NAME: " + PatientName);
            System.out.println("CONTACT NUMBER: " + Contact_No);
            System.out.println("BLOOD GROUP: " + BloodGroup);
            System.out.println("GENDER: "  + Gender);
            System.out.println("ADDRESS: " + Address);
            System.out.println("AGE: " + Age);
        }
    }