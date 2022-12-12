package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Contact;
import app.ContactService;

class ContactServiceTest {
	
	Contact contact = new Contact("12345", "Testing", "Contact", "1234567891", "1234 Address Lane");
	Contact contact1 = new Contact("1234567", "Testing", "Contact", "1234567891", "1234 Address Lane");
	Contact contactSameId = new Contact("12345", "Testing", "Contact", "1234567891", "1234 Address Lane");
	ContactService contactService = new ContactService();

//	Test adding a single contact
	@Test
	void testContactServiceAddSingleContact() {
		assertEquals(true, contactService.addContact(contact));
		
	}
	
//	Test adding multiple contacts
	@Test
	void testContactServiceAddMultipleContacts() {
		contactService.addContact(contact);
		assertEquals(true, contactService.addContact(contact1));
		
		
		
	} 
//	Test if an error occurs when adding a contact with a duplicate ID
	@Test
	void testContactServiceDuplicateId() {
		contactService.addContact(contact);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contactSameId);
		});
		
	}

//	Test updating First name
	@Test
	void testContactServiceUdpdateFirstName() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactFirstName("12345", "Wow"));
		
	}
	
	//Test updating Last name
	@Test
	void testContactServiceUpdateLastName() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactLastName("12345", "New Last"));
		}
	
	//Test updating number
	@Test
	void testContactServiceUpdateNumber() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactNumber("12345", "9876543211"));
	}
	
	//Test updating address
	@Test
	void testContactServiceUpdateAddress() {
		contactService.addContact(contact);
		assertEquals(true, contactService.updateContactAddress("12345", "New Address"));
	}
	
//	Test deleting a contact
	@Test
	void testContactServiceDeleteContact() {
		contactService.addContact(contact);
		assertEquals(true, contactService.deleteContact("12345"));
		
	}
	
}
