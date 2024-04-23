    import java.util.*;

import javax.print.Doc;
    public class Patient
    {
        static int PatientID_Gen = 305;
        private int PatientID;
        private int allottedDoctorID;
        private int allottedNurseID;
        private String PatientName;
        private String Contact_No;
        private String Address;
        private String BloodGroup;
        private String Gender;
        String[] DepartmentConcernedList = {"Rheumatology","Cardiology","Pediatry","ENT","Dentist"};
        private String DepartmentConcerned;
        private int Age;    

        public Patient(DataBase dat)
        {
            PatientID = ++PatientID_Gen;

            Scanner scan = new Scanner(System.in);
            System.out.println("\n-------------- ADDING PATIENTS---------------");
            System.out.print("PATIENT'S NAME: ");
                PatientName = scan.nextLine();

            // GENDER INPUT
            System.out.print("GENDER: ");
            System.out.println("\n  1 => Male.");
            System.out.println("  2 => Female.");
            System.out.println("  3 => Others.");
            int chooseGender = scan.nextInt();
            switch(chooseGender)
            {
                case 1:
                    Gender = "Male"; break;
                case 2:
                    Gender = "Female"; break;
                case 3:
                    Gender = "Others"; break;
            }

            System.out.println("\nSelect Nature of Illness:");
            System.out.println("1. Joint-Pain Issues");
            System.out.println("2. Cardiac Issues");
            System.out.println("3. Dietary Issues");
            System.out.println("4. ENT Issues");
            System.out.println("5. Dental Issues\n");
    
            whileloop: while (true) 
            {
                System.out.print("Enter Choice: ");
                int n = scan.nextInt();
                switch (n) 
                {
                    case 1:
                    DepartmentConcerned  = DepartmentConcernedList[0];
                        break whileloop;
                    case 2:
                    DepartmentConcerned  = DepartmentConcernedList[1];
                        break whileloop;  
                    case 3:
                    DepartmentConcerned  = DepartmentConcernedList[2];
                        break whileloop;  
                    case 4:
                    DepartmentConcerned  = DepartmentConcernedList[3];
                        break whileloop;  
                    case 5:
                    DepartmentConcerned  = DepartmentConcernedList[4];
                        break whileloop;

                    default:
                    System.out.println("Please select a valid option");
                        break;
                }    
            }

            // Alloting Doctor to the Patient.
            this.allot_Doctor(dat);

            // Alloting Nurse to the Patient.
            this.allot_Nurse(dat);

            // AGE INPUT:
            System.out.print("ENTER AGE: ");
            while(true)
            {
                try
                {
                    Age = scan.nextInt();
                }
                catch(InputMismatchException input)
                {
                    System.out.println("Invalid Age. Please enter a valid integer as age : ");
                    scan.next();
                    continue;
                }

                if(Age < 0)
                {
                    System.out.println("Invalid Age. Enter the Age again : ");
                    continue;
                }
                else break;
            }


            System.out.print("\nENTER CONTACT NUMBER: ");
            scan.next();
            while(true)
            {
                Contact_No = scan.nextLine();
                System.out.println();
                if(!Contact_No.matches("^\\d{10}$"))
                {
                    System.out.println("Invalid Contact Number....\n  Enter Contact Number again : ");
                }
                else
                    break;
            }
            

            // BLOODGROUP INPUT
            BGLOOP: while(true)
            {

                System.out.println("SELECT BLOOD GROUP: ");
                System.out.println("  1 => A+");
                System.out.println("  2 => A-");
                System.out.println("  3 => B+");
                System.out.println("  4 => B-");
                System.out.println("  5 => AB+");
                System.out.println("  6 => AB-");
                System.out.println("  7 => O+");
                System.out.println("  8 => O-");
                int chooseBG = scan.nextInt();

                switch(chooseBG)
                {
                    case 1:
                        BloodGroup = "A+"; break BGLOOP;
                    case 2:
                        BloodGroup = "A-"; break BGLOOP;
                    case 3:
                        BloodGroup = "B+"; break BGLOOP;
                    case 4:
                        BloodGroup = "B-"; break BGLOOP;
                    case 5:
                        BloodGroup = "AB+"; break BGLOOP;
                    case 6:
                        BloodGroup = "AB-"; break BGLOOP;
                    case 7:
                        BloodGroup = "O+"; break BGLOOP;
                    case 8:
                        BloodGroup = "O-"; break BGLOOP;
                    default:
                        System.out.println("\nPlease Select Valid Blood Group....");
                        break;
                }
            }

            System.out.print("ADDRESS: ");
                Address = scan.nextLine();

            
                 

        }


        // Dummy data constructor
        public Patient(int PatientID,String PatientName,String Contact_No,String Address,String BloodGroup,String Gender,int Age,String DepartmentConcerned,int allottedDoctorID, int allottedNurseID)
        {
            this.PatientID = PatientID;
            this.PatientName = PatientName;
            this.Contact_No = Contact_No;
            this.Address = Address;
            this.BloodGroup = BloodGroup;
            this.Gender = Gender;
            this.Age = Age;
            this.DepartmentConcerned = DepartmentConcerned;
            this.allottedDoctorID = allottedDoctorID;
            this.allottedNurseID = allottedNurseID;
        }

        public int get_Id()
        {
            return this.PatientID;
        }

        public void allot_Doctor(DataBase dat)
        {
            // the allot_Nurse() function (belonging to the Patient Class) and the 
            // assign_Nurse() function (belonging to the Doctor Class) act as interface
            // between the Patient Class and the DataBase Class
            // for the purpose of information exchange.

            this.allottedDoctorID = dat.assign_Doctor(this.DepartmentConcerned, this.get_Id());
        }

        public int getAllotedDoctor()
        {
            return this.allottedDoctorID;
        }

        public void allot_Nurse(DataBase dat)
        {
            // the allot_Nurse() function (belonging to the Patient Class) and the 
            // assign_Nurse() function (belonging to the Doctor Class) act as interface
            // between the Patient Class and the DataBase Class
            // for the purpose of information exchange.

            this.allottedNurseID = dat.assign_Nurse(this.get_Id());
        }

        public int getAllotedNurse()
        {
            return this.allottedNurseID;
        }

        public void getPatientReport(DataBase dat)
        {
            this.displayPatient();
            // now displaying details of the doctor alloted
            Iterator<Doctor> iterator = dat.docData.iterator();
            while (iterator.hasNext()) 
            {
                Doctor doc  = iterator.next();
                if (doc.get_Id() == this.allottedDoctorID) 
                {
                    System.out.println("\nDoctor Alloted: ");
                    doc.displayDoctor(1);
                    break;
                }
            }
            // now displaying details of the nurse alloted
            Iterator<Nurse> iterator2 = dat.nurData.iterator();
            while (iterator2.hasNext()) 
            {
            Nurse nur  = iterator2.next();
                if (nur.get_Id() == this.allottedNurseID) 
                {
                    System.out.println("\nNurse Alloted: ");
                    nur.displayNurse(1);
                    break;
                }
            }
        }

        public void displayPatient()
        {
            System.out.println("-------------------------------------------------");
            System.out.println("\t\tPatient ID: "+ PatientID);
            System.out.println("\nFULL NAME: " + PatientName);
            System.out.println("CONTACT NUMBER: " + Contact_No);
            System.out.println("BLOOD GROUP: " + BloodGroup);
            System.out.println("GENDER: "  + Gender);
            System.out.println("ADDRESS: " + Address);
            System.out.println("AGE: " + Age);
            System.out.println("Consulting Physician: " + DepartmentConcerned);
            System.out.println("Alloted Doctor ID: "+ allottedDoctorID);
            System.out.println("Alloted Nurse ID: "+ allottedNurseID);
        }
    }