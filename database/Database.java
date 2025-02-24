package database;
import models.Patient;
import models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<Patient> patients = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();

    public static void addPatient(Patient patient) {
        patients.add(patient);
    }

    public static void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public static List<Patient> getPatients() {
        return patients;
    }

    public static List<Doctor> getDoctors() {
        return doctors;
    }

    public static void removePatient(int id) {
        patients.removeIf(patient -> patient.getId() == id);
    }

    public static void removeDoctor(int id) {
        doctors.removeIf(doctor -> doctor.getId() == id);
    }
}
