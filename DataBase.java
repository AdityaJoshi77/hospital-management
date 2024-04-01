import java.util.ArrayList;

public class DataBase
{
    ArrayList<Patient> patData = new ArrayList<>();
    ArrayList<Doctor> docData = new ArrayList<>();
    ArrayList<Nurse> nurData = new ArrayList<>();

    public void addPatient(Patient Pat)
    {
        patData.add(Pat);
    }

    public void addDoctor(Doctor Doc)
    {
        docData.add(Doc);
    }

    public void addNurse(Nurse Nur)
    {
        nurData.add(Nur);
    }
    
    public void removePatient(Patient Pat){
        patData.remove(Pat);
    }

    public void removeDoctor(Doctor Doc){
        docData.remove(Doc);
    }

    public void removeNurse(Nurse Nur){
        nurData.remove(Nur);
    }
}