package app;

import java.util.Date;

public class Appointment {
	private String appointmentId;
	private String appointmentDescription;
	Date appointmentDate = new Date(); 
	
	
	public Appointment( String appointmentId, Date appointmentDate, String appointmentDescription) {
		Date currentDate = new Date();
	
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid task id");
		}
		if (appointmentDate == null || appointmentDate.before(currentDate)) {
			System.out.println(appointmentDate);
			throw new IllegalArgumentException("Error: Invalid appointment date");
		}
		
		if (appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Error: Invalid description");
		}
		
		
		this.setAppointmentId(appointmentId);
		this.setAppointmentDate(appointmentDate);
		this.setAppointmentDescription(appointmentDescription);
//		
		}
	
	public void setAppointmentId(String appointmentId) {
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid task id");
		}
		else {
			this.appointmentId = appointmentId;

		}
	}
		
		public void setAppointmentDate(Date appointmentDate) {
			Date currentDate = new Date();
			if (appointmentDate == null || appointmentDate.before(currentDate)) {
				throw new IllegalArgumentException("Error: Invalid appointment date");
			
		}
			else {
				this.appointmentDate = appointmentDate;
			}
		}
		
		public void setAppointmentDescription(String appointmentDescription) {
			if (appointmentDescription == null ||appointmentDescription.length() > 50) {
				throw new IllegalArgumentException("Error: Invalid description");
		}
			else {
				this.appointmentDescription = appointmentDescription;
			}
		}
		
		public String getAppointmentId() {
			return this.appointmentId;
		}
		
		public Date getAppointmentDate() {
			return this.appointmentDate;
		}
		
		public String getAppointmentDescription() {
			return this.appointmentDescription;
		}
}