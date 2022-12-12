package app;

import java.util.Date;

public class Appointment {
	private String appointmentId;
	private String appointmentDescription;
	Date appointmentDate = new Date(); 
	
	// Creating appointment object with parameters
	public Appointment( String appointmentId, Date appointmentDate, String appointmentDescription) {
		Date currentDate = new Date();
	
	//Verification around memory allocation & valid input data
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid task id");
		}

		//appointment date cant be in the past & cant be null
		if (appointmentDate == null || appointmentDate.before(currentDate)) {
			System.out.println(appointmentDate);
			throw new IllegalArgumentException("Error: Invalid appointment date");
		}
		
		//Verification around memory allocation & valid input data
		if (appointmentDescription == null || appointmentDescription.length() > 50) {
			throw new IllegalArgumentException("Error: Invalid description");
		}
		
		
		this.setAppointmentId(appointmentId);
		this.setAppointmentDate(appointmentDate);
		this.setAppointmentDescription(appointmentDescription);
//		
		}

	// Method for saving app id to data structure
	public void setAppointmentId(String appointmentId) {
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid task id");
		}
		else {
			this.appointmentId = appointmentId;

		}
	}
		
		// Method for saving app date to data structure
		public void setAppointmentDate(Date appointmentDate) {
			Date currentDate = new Date();
			if (appointmentDate == null || appointmentDate.before(currentDate)) {
				throw new IllegalArgumentException("Error: Invalid appointment date");
			
		}
			else {
				this.appointmentDate = appointmentDate;
			}
		}
		
		// Method for saving app description to data structure
		public void setAppointmentDescription(String appointmentDescription) {
			if (appointmentDescription == null ||appointmentDescription.length() > 50) {
				throw new IllegalArgumentException("Error: Invalid description");
		}
			else {
				this.appointmentDescription = appointmentDescription;
			}
		}
		
		//method for retrieving appointment id
		public String getAppointmentId() {
			return this.appointmentId;
		}
		
		//method for retrieving appointment date
		public Date getAppointmentDate() {
			return this.appointmentDate;
		}
		
		//method for retrieving appointment desc
		public String getAppointmentDescription() {
			return this.appointmentDescription;
		}
}