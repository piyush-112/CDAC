package Com.Validation;
import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.util.*;
import Com.Tester.*;

import Com.CustException.LicenseExpiredException;
public class LicenseValidation {
	public static void validateDate(String date) throws LicenseExpiredException, ParseException {
		//@SuppressWarnings("unused")
		//class foe the parsing the date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d1=sdf.parse(date);  //convert the string date to date  
		Date CurrentDate=new Date();   //to get the current date using the Date class
		if(d1.before(CurrentDate)) {   //before date package method to compare the date
			throw new LicenseExpiredException("License Got Expired please renew ASAP");
		}
		if(d1.after(CurrentDate)) {    //after date package method to compare the date
			System.out.println("Valid Licence");
		}
//		else {
//		}
	}
}
