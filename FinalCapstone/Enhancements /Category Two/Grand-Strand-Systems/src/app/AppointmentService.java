package app;

import java.util.ArrayList;

public class AppointmentService {
	
	//array of Appointments
	ArrayList<Appointment> appointments;
	
	public AppointmentService() {
		appointments = new ArrayList<>();
	}
	
	//Add Appointment via unique Id
	public boolean addAppointment(Appointment newAppointment) {
		boolean contains = false;
		for (Appointment appt : appointments) {
			if (appt.getAppointmentId().equals(newAppointment.getAppointmentId())) {
				contains = true;
				break;
			}
		}
		if (!contains) {
			appointments.add(newAppointment);
			return true;
		}
		else {
			throw new IllegalArgumentException("Appointment id is a duplicate");
		}
	}
	
	//Deletes Appointment via appointment id
	
	public boolean deleteAppointment(String appointmentId) {
		boolean deleted = false;
		for (Appointment appt : appointments) {
			if (appt.getAppointmentId().equals(appointmentId)) {
				appointments.remove(appt);
				deleted = true;
				break;
			}
		}
		if (!deleted) {
			throw new IllegalArgumentException("Error: Id Not Found");
		}
		else {
			return deleted;
		}
	}

}
