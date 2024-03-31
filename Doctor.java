public class Doctor extends Employee {

    String specialization;

    public int numberOfPatientsAssigned = 0;

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    void setNumberOfPatientsAssigned() {
        numberOfPatientsAssigned++;
    }

    public int getNumberOfPatientsAssigned() {
        return numberOfPatientsAssigned;
    }

    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        d1.setNumberOfPatientsAssigned();
        System.out.println(d1.getNumberOfPatientsAssigned());
    }
}
