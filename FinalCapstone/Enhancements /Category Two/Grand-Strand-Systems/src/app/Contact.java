package app;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String addressNum;
	private String phoneNum;
	private String contact;


	//creating a contact object with parameters
	public Contact(String contactId,String fName,String lName,String phone,String address){

		//contact creation throws exception if id is not valid
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Error: Invalid contact id");
		}
		else {
		this.contact = contactId;
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setPhoneNumber(phone);
		this.setAddress(address);
		}
	}
	
	//sets phone number to contact object
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Error: Invalid phone number");
		}
		else {
			this.phoneNum = phoneNumber;
		}
	}

//sets first name to contact object
	public void setFirstName(String fName) {
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Error: First Name too long or null");
		}
		else {
			this.firstName = fName;
		}
	}
	
	//sets last name to contact object
	public void setLastName(String lName) {
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Error: Last Name too long or null");
		}
		else {
			this.lastName = lName;
		}
	}

//sets address to contact object
	public void setAddress(String address) {
		if( address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid Address");
		}
		else {
			this.addressNum = address;
		}
	}
	
	//retrieves phone number from data structure
	public String getPhoneNumber() {
		return this.phoneNum;
	}
	
	//retrieves address from data structure
	public String getAddress() {
		return this.addressNum;
	}

	//retrieves contact from data structure
	public String getContact() {
		return this.contact;
	}

	//retrieves first name from data structure
	public String getFirstName() {
		return this.firstName;
	}

	//retrieves last name from data structure
	public String getLastName() {
		return this.lastName;
	}


}
