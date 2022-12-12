package app;
import java.util.ArrayList;

public class ContactService {
	//array list of contacts
	ArrayList<Contact> contacts;

	public ContactService() {
		contacts = new ArrayList<>();
	}

	// Add Contacts via Unique ID
	public boolean addContact(Contact newContact) {
		boolean contains = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(newContact.getContact())) {
				contains = true;
				break;
			}
		}

		if (!contains) {
			contacts.add(newContact);
			return true;
		} else {
			throw new IllegalArgumentException("Contact id is a duplicate");
		}
	}

	// Delete Contacts via contact Id
	public boolean deleteContact(String contactId) {
		boolean deleted = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactId)) {
				contacts.remove(contact);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Update First name via contact id
	public boolean updateContactFirstName(String contactID, String newFirstName) {
		boolean updated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setFirstName(newFirstName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// update last name via contact id
	public boolean updateContactLastName(String contactID, String newLastName) {
		boolean updated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setLastName(newLastName);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update number via contact id
	public boolean updateContactNumber(String contactID, String newNumber) {
		boolean updated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setPhoneNumber(newNumber);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update Address via contact id
	public boolean updateContactAddress(String contactID, String newAddress) {
		boolean updated = false;
		for (Contact contact : contacts) {
			if (contact.getContact().equals(contactID)) {
				contact.setAddress(newAddress);
				updated = true;
				break;
			}
		}
		return updated;
	}
}