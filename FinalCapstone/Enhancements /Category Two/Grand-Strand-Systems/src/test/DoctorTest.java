package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Doctor;

class DoctorTest {
    
    //Test creating a doctor object
    @Test
    void testDoctorCreated() {
        Doctor doctor = new Doctor("33432", "Test", "Doctor", "Cardiologist";
        assertTrue(doctor.getDoctor().equals("33432"));
        assertTrue(doctor.getFirstName().equals("Test"));
        assertTrue(doctor.getLastName().equals("Doctor"));
        assertTrue(doctor.getDescription().equals("Cardiologist"));
    }

    //Test doctor ID  too long
    @Test
    void testDoctorIdTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345678910", "Dr.", "Doctor", "Pulmonologist");
        });
    }

    //  Test if DoctorId is Null
    @Test
    void testDoctorIdNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor(null, "Dr.", "Doctor", "Surgeon");
        });
    }

    //	Test if first name is too long
    @Test
    void testFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345", "AFirstNameIstooLongHere", "lastName", "Dermatologist");
        });
    }

    //  Test if first name is null
    @Test
    void testFirstNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345", null, "testing", "Podiatrist");
        });
    }

    //	Test if last name is too long
    @Test
    void testLastNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345", "Bob", "lastNameThatIsWaaaayToooLong", "Dermatologist");
        });
    }

    //  Test if last name is null
    @Test
    void testLastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345", "Mary", null, "Podiatrist");
        });
    }

    //  Test if Description is null
    @Test
    void testLastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Doctor("12345", "Mary", "Littlelamb", null);
        });
    }

}