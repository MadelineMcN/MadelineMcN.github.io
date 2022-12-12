package app;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String addressNum;
	private String phoneNum;
	private String contact;
	
	public Contact(String contactId,String fName,String lName,String phone,String address){
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
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Error: Invalid phone number");
		}
		else {
			this.phoneNum = phoneNumber;
		}
	}

	public void setFirstName(String fName) {
		if(fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Error: First Name too long or null");
		}
		else {
			this.firstName = fName;
		}
	}
	
	public void setLastName(String lName) {
		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Error: Last Name too long or null");
		}
		else {
			this.lastName = lName;
		}
	}

	public void setAddress(String address) {
		if( address == null || address.length() > 30) {
			throw new IllegalArgumentException("Error: Invalid Address");
		}
		else {
			this.addressNum = address;
		}
	}
	
	public String getPhoneNumber() {
		return this.phoneNum;
	}
	
	public String getAddress() {
		return this.addressNum;
	}


	public String getContact() {
		return this.contact;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}


}
