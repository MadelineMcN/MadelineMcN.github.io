package app;
import java.util.ArrayList;

public class DoctorService {
    //array list of doctors
    ArrayList<Doctor> doctors;

    public DoctorService() {
        doctors = new ArrayList<>();
    }

    // Add Doctor via Unique ID
    public boolean addDoctor(Doctor newDoctor) {
        boolean contains = false;
        for (Doctor doctor : doctors) {
            if (doctor.getDoctor().equals(newDoctor.getDoctor())) {
                contains = true;
                break;
            }
        }
        // if doctor exsists, do not add new doctor, display error message
        if (!contains) {
            doctors.add(newDoctor);
            return true;
        } else {
            throw new IllegalArgumentException("Doctor id is a duplicate");
        }
    }

    // Delete Doctor from interal data structure via doctor id
    public boolean deleteDoctor(String doctorId) {
        boolean deleted = false;
        for (Doctor doctor : doctors) {
            if (doctor.getDoctor().equals(doctorId)) {
                doctors.remove(doctor);
                deleted = true;
                break;
            }
        }
        return deleted;
    }

    // Update First name via doctor id
    public boolean updateDoctorFirstName(String doctorID, String newFirstName) {
        boolean updated = false;
        for (Doctor doctor : doctors) {
            if (doctor.getDoctor().equals(doctorID)) {
                doctor.setFirstName(newFirstName);
                updated = true;
                break;
            }
        }
        return updated;
    }


    // update last name via doctor id
    public boolean updateDoctorLastName(String doctorID, String newLastName) {
        boolean updated = false;
        for (Doctor doctor : doctors) {
            if (doctor.getDoctor().equals(doctorID)) {
                doctor.setLastName(newLastName);
                updated = true;
                break;
            }
        }
        return updated;
    }

    // Update number via doctor id
    public boolean updateDoctorDescription(String doctorID, String newDescription) {
        boolean updated = false;
        for (Doctor doctor : doctors) {
            if (doctor.getDoctor().equals(doctorID)) {
                doctor.setDescription(newDescription)
                updated = true;
                break;
            }
        }
        return updated;
    }
}
    
    
    