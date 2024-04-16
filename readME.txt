Hospital Management System


Introduction
Welcome to the Hospital Management System! This application is designed to assist hospital staff in managing patient, doctor, and nurse information efficiently. Whether you're a healthcare professional or an administrative staff member, this system aims to streamline the process of handling and organizing essential hospital data.

Features

Patient Management
Add new patients with detailed information such as name, contact number, address, blood group, gender, and age.
View and search for existing patients.
Display a comprehensive patient profile including all their details.

Doctor Management
Add new doctors with specialization in different departments.
Assign patients to specific doctors for treatment.
View and search for doctors based on their department or specialization.

Nurse Management
Add new nurses working in various departments like Cardiology, Rheumatalogy, etc.
Assign patients to nurses for care.
View and search for nurses based on their department.


User-Friendly Interface
Interactive menus for easy navigation.
Simple and intuitive commands for adding, searching, and managing records.


Admin Class
main(String[] args): Main method to run the application and display the main menu.

DataBase Class
searchPatient(int patID): Searches for a patient by their ID.
searchDoctor(int docID): Searches for a doctor by their ID.
searchNurse(int nurID): Searches for a nurse by their ID.
displayAllPatients(): Displays details of all patients.
displayAllDoctors(): Displays details of all doctors.
displayAllNurses(): Displays details of all nurses.
addPatient(Patient Pat): Adds a new patient to the database.
addDoctor(Doctor Doc): Adds a new doctor to the database.
addNurse(Nurse Nur): Adds a new nurse to the database.
removePatient(int pat_ID): Removes a patient from the database.
removeDoctor(int doc_ID): Removes a doctor from the database.
removeNurse(int nur_ID): Removes a nurse from the database.

Employee Class
Employee(): Constructor to initialize employee details.
Employee(String employeeName, int employeeID, int salary, String type): Constructor with parameters for dummy data.
displayEmployee(): Displays details of an employee.

Doctor Class
Doctor(): Constructor to initialize doctor details.
Doctor(int doctorID, String employeeName, int employeeID, String department, String jobTitle, int salary): Constructor with parameters for dummy data.
get_Id(): Returns the doctor's ID.
displayDoctor(): Displays details of a doctor.

Nurse Class
Nurse(): Constructor to initialize nurse details.
Nurse(int nurseID, String employeeName, int employeeID, int salary): Constructor with parameters for dummy data.
get_Id(): Returns the nurse's ID.
displayNurse(): Displays details of a nurse.

Patient Class
Patient(): Constructor to initialize patient details.
Patient(int PatientID, String PatientName, String Contact_No, String Address, String BloodGroup, String Gender, int Age): Constructor with parameters for dummy data.
get_Id(): Returns the patient's ID.
displayPatient(): Displays details of a patient.