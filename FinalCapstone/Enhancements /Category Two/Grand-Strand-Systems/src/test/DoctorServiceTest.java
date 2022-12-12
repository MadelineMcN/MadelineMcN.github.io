package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Doctor;
import app.DoctorService;

class DoctorServiceTest {
    Doctor doctor = new Doctor("12345", "Testing", "Doctor", "Cardiologist");
    Doctor doctor1 = new Doctor("1234567", "Testing", "Doctor", "Psychologist");
    Doctor doctorSameId = new Doctor("12345", "Testing", "Doctor", "OBGYN");
    DoctorService doctorService = new DoctorService();

    //	Test adding a single doctor
    @Test
    void testDoctorServiceAddSingleDoctor() {
        assertEquals(true, doctorService.addDoctor(doctor));
    }

    //	Test adding multiple doctors
    @Test
    void testDoctorServiceAddMultipleDoctors() {
        doctorService.addDoctor(doctor);
        assertEquals(true, doctorService.addDoctor(doctor1));
    }

    //	Test if an error occurs when adding a doctor with a duplicate ID
    @Test
    void testDoctorServiceDuplicateId() {
        doctorService.addDoctor(doctor);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            doctorService.addDoctor(doctorSameId);
        });
    }

    //	Test updating First name
    @Test
    void testDoctorServiceUdpdateFirstName() {
        doctorService.addDoctor(doctor);
        assertEquals(true, doctorService.updateDoctorFirstName("12345", "New First"));
    }

    //Test updating Last name
    @Test
    void testDoctorServiceUpdateLastName() {
        doctorService.addDoctor(doctor);
        assertEquals(true, doctorService.updateDoctorLastName("12345", "New Last"));
    }

    //Test updating description
    @Test
    void testDoctorServiceUpdateDescription() {
        doctorService.addDoctor(doctor);
        assertEquals(true, doctorService.updateDoctorDescription("12345", "Surgeon"));
    }

    //	Test deleting a doctor
    @Test
    void testDoctorServiceDeleteDoctor() {
        doctorService.addDoctor(doctor);
        assertEquals(true, doctorService.deleteDoctor("12345"));
    }
    
}