package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Appointment;
import app.AppointmentService;

class AppointmentServiceTest {
	
	AppointmentService appointmentService = new AppointmentService();
	Date date1 = new GregorianCalendar(2026, Calendar.JULY, 15).getTime();
	Appointment appointment = new Appointment("12345",date1, "Test Description");

	
	
	//Added  Appointment
	@Test
	void testAppointmentServiceAdd() {
		assertEquals(true, appointmentService.addAppointment(appointment));
	}
	
	//Added Multiple Appointments
	@Test
	void testAppointmentServiceMultpleAdded() {
		Appointment newAppointment = new Appointment("54321", date1,"Notes" );
		appointmentService.addAppointment(appointment);
		assertEquals(true, appointmentService.addAppointment(newAppointment));
		
	}
	
	//Verifies id is unique
	@Test
	void testAppointmentServiceNoDuplicateIds() {
		appointmentService.addAppointment(appointment);
		Appointment newAppt = new Appointment("12345", date1, "Party Description woo");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.addAppointment(newAppt);
		});
	}

	//Deletes Appointment
	@Test
	void testAppointmentServiceDeletes() {
		appointmentService.addAppointment(appointment);
		assertEquals(true, appointmentService.deleteAppointment("12345"));

	}
	
	// Wrong id When deleting , assert fail
	@Test
	void testAppointmentServiceDeleteIdNotFound() {
		appointmentService.addAppointment(appointment);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointmentService.deleteAppointment("123456");
		});
		
	}
	
}
