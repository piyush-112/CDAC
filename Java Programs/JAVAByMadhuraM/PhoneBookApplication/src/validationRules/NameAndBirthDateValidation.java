package validationRules;

import java.time.LocalDate;
import java.util.List;

import contact.Contact;
import custom.exceptions.SameNameAndBirthdateException;

public class NameAndBirthDateValidation {
	public static void validateNameAndBirthDate(String name1,LocalDate dateOfBirth1, List<Contact> contacts1) throws SameNameAndBirthdateException {
		for(Contact c:contacts1) {
			//validate Name and Birth Date
			if(c.getName().equals(name1) && c.getDateOfBirth().equals(dateOfBirth1)) {
				throw new SameNameAndBirthdateException("Two Person cannot have same Name & Date of Birth");
			}
		}
	}
}
