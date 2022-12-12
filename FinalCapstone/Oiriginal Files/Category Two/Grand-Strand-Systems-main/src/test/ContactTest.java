package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Contact;

class ContactTest {

//Test creating a contact object\
	@Test
	void testContactCreated() {
		Contact contact = new Contact("12345", "Testing", "Contact", "1234567891", "1234 Address Lane");
		assertTrue(contact.getContact().equals("12345"));
		assertTrue(contact.getFirstName().equals("Testing"));
		assertTrue(contact.getLastName().equals("Contact"));
		assertTrue(contact.getPhoneNumber().equals("1234567891"));
		assertTrue(contact.getAddress().equals("1234 Address Lane"));
	}
	
//	 contact ID  too long
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678910", "Testing", "Contact", "1234567891", "1234 Address Lane");
		});
	}
	
//  ContactID Null
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Testing", "Contact", "1234567891", "1234 Address Lane");
		});
	}
	
//	first name too long
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "TestingIsAHabit", "GetLikeMe", "1234567891", "1234 Address Lane");
		});
	}
	
//  first name null
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", null, "Contact", "1234567891", "1234 Address Lane");
		});
	}
	
//	contact address too long
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Testing", "Contact", "1234567891", "Address can not being any longer that 30 characters and can not be null. Otherwise an exception is thrown that reads the error message");
		});
	}
	
// contact address null
	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123451", "Testing", "Contact", "1234567891", null);
		});
	}
	
//	Phone number not 10 digits
	@Test
	void testPhoneNumberDigitCount() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345", "Testing", "Contact", "12345678910", "1234 Address Lane");
		});
		
	}

}
