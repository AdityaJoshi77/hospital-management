import java.io.IOException;
import java.util.ArrayList;

public class DataBase {
    ArrayList<Patient> patData = new ArrayList<>();
    ArrayList<Doctor> docData = new ArrayList<>();
    ArrayList<Nurse> nurData = new ArrayList<>();

    public DataBase() throws IOException {
        // DUMMY DATA
        // -------------------------------------------------------------------------------------------

        // Adding dummy data for patients
        Patient patient1 = new Patient(101, "Anjali Gupta", "1234567890", "123, Main Street, City", "O+", "Female", 35);
        patData.add(patient1);

        Patient patient2 = new Patient(102, "Amit Singh", "9876543210", "456, Second Avenue, Town", "A-", "Male", 45);
        patData.add(patient2);

        Patient patient3 = new Patient(103, "Priya Sharma", "9998887776", "789, Third Road, Village", "B+", "Female",
                25);
        patData.add(patient3);

        Patient patient4 = new Patient(104, "Rahul Kapoor", "8887776665", "101, Fourth Lane, Countryside", "AB-",
                "Male", 55);
        patData.add(patient4);

        Patient patient5 = new Patient(105, "Neha Patel", "6665554443", "678, Fifth Street, Suburb", "O-", "Female",
                30);
        patData.add(patient5);

        // // Adding dummy data for doctors
        System.out.println("Entering the details of doctor1");
        Doctor doctor1 = new Doctor(101, "Dr. Rajesh Kumar", 1001, "Cardiology", "Cardiologist", 150000, "Heart");
        
        docData.add(doctor1);

        Doctor doctor2 = new Doctor(102, "Dr. Priya Patel", 1002, "Orthopedics", "Orthopedic Surgeon", 140000,
                "Bone Fractures");
        docData.add(doctor2);

        Doctor doctor3 = new Doctor(103, "Dr. Amit Sharma", 1003, "Gynecology", "Gynecologist", 130000, "Obstetrics");
        docData.add(doctor3);

        // Adding dummy data for nurses
        Nurse nurse1 = new Nurse(201, "Nurse Sunita Verma", 2001, "ICU", "Registered Nurse", 80000);
        nurData.add(nurse1);

        Nurse nurse2 = new Nurse(202, "Nurse Sanjay Mishra", 2002, "Pediatrics", "Pediatric Nurse", 75000);
        nurData.add(nurse2);

        Nurse nurse3 = new Nurse(203, "Nurse Meera Patel", 2003, "Emergency", "Emergency Nurse", 85000);
        nurData.add(nurse3);

        // -------------------------------------------------------------------------------------------

    }

    public static void main(String[] args) throws IOException
    {

        DataBase datab = new DataBase();
        

        

        System.out.println("\n------------------Nurses Data----------------------");
        for(Nurse nur : datab.nurData)
        {
            System.out.println("---------------------------------------------------\n");
            nur.displayNurse();
        }

    }

    public void displayAllPatients()
    {
        System.out.println("\n------------------Patients Data----------------------");
        for(Patient pat : this.patData)
        {
            System.out.println("---------------------------------------------------\n");
            pat.displayPatient();
        }
    }

    public void displayAllDoctors()
    {
        System.out.println("\n------------------Doctors Data----------------------");
        for(Doctor doc : this.docData)
        {
            System.out.println("---------------------------------------------------\n");
            doc.displayDoctor();
        }
    }

    public void displayAllNurses()
    {
        System.out.println("\n------------------Doctors Data----------------------");
        for(Nurse nur : this.nurData)
        {
            System.out.println("---------------------------------------------------\n");
            nur.displayNurse();
        }
    }

    public void addPatient(Patient Pat) {
        patData.add(Pat);
    }

    public void addDoctor(Doctor Doc) {
        docData.add(Doc);
    }

    public void addNurse(Nurse Nur) {
        nurData.add(Nur);
    }

    public void removePatient(Patient Pat) {
        patData.remove(Pat);
    }

    public void removeDoctor(Doctor Doc) {
        docData.remove(Doc);
    }

    public void removeNurse(Nurse Nur) {
        nurData.remove(Nur);
    }

}