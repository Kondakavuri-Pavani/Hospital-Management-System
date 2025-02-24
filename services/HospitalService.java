package services;
import database.Database;
import models.Patient;
import models.Doctor;

import java.util.List;

public class HospitalService {

    public void addPatient(int id, String name, int age, String disease) {
        Patient patient = new Patient(id, name, age, disease);
        Database.addPatient(patient);
        System.out.println("Patient added successfully!");
    }

    public void addDoctor(int id, String name, String specialization) {
        Doctor doctor = new Doctor(id, name, specialization);
        Database.addDoctor(doctor);
        System.out.println("Doctor added successfully!");
    }

    public void viewPatients() {
        List<Patient> patients = Database.getPatients();
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient p : patients) {
                System.out.println(p);
            }
        }
    }

    public void viewDoctors() {
        List<Doctor> doctors = Database.getDoctors();
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor d : doctors) {
                System.out.println(d);
            }
        }
    }

    public void removePatient(int id) {
        Database.removePatient(id);
        System.out.println("Patient removed successfully!");
    }

    public void removeDoctor(int id) {
        Database.removeDoctor(id);
        System.out.println("Doctor removed successfully!");
    }
}
