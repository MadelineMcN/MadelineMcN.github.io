package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Appointment;

class AppointmentTest {
	

	Date date1 = new GregorianCalendar(2026, Calendar.JULY, 15).getTime();
	Date date2 = new GregorianCalendar(2021, Calendar.MARCH, 12).getTime();
	
	//Appointment created
	@Test
	void testAppointmentCreated() {
		Appointment appt = new Appointment("12345", date1, "Test appiointment creation");
		assertTrue(appt.getAppointmentId().equals("12345"));
		assertTrue(appt.getAppointmentDate().equals(date1));
		assertTrue(appt.getAppointmentDescription().equals("Test appiointment creation"));
	}
	
	//id too long
	@Test
	void testAppointmentTooLongId() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678910", date1, "tesing123");
		});	
	}
	
	//Null id
	@Test
	void testAppointmentNullIdInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, date1, "tesing123");
		});
	
	}
	
	// Null data throws exception
	@Test
	void testAppointmentNullDateInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null, "tesing123");
		});
		
	}
	// Past date throws exception
	@Test
	void testAppointmentPastDateInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", date2, "tesing123");
		});
		
	}
	
	//Appt. Description too long throws exception
	@Test
	void testAppointmentDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", date1, "Description can not being any longer that 50 characters and can not be null. Otherwise an exception is thrown that reads the error message");
		});
	}
	
	//Appt. Description null throws exception
	@Test
	void testAppointmentDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", date1, null);
		});
		
	}

}
