package validationRules;

import java.util.List;

import contact.Contact;
import custom.exceptions.DuplicatePhoneNumberException;


public class PhoneNoValidation {
	public static String validatePhoneNo(String PhoneNo1, List<Contact> contacts1) throws DuplicatePhoneNumberException {
		for(Contact c: contacts1) {
			//Validate Phone Number
			if(c.getPhoneNo().equals(PhoneNo1)) {
				throw new DuplicatePhoneNumberException("Phone no Already Exists!");
			}
		}
		return PhoneNo1;
		
	}
}
