package Com.Tester;
import Com.CustException.*;  
import static Com.Validation.LicenseValidation.*;

import java.text.ParseException;
import java.util.Scanner;

public class LicenseTester {
	//throws the exception name at the main
	public static void main(String x[]) throws LicenseExpiredException, ParseException {
		try(Scanner sc=new Scanner(System.in)){
			//i/p the date from the user
			System.out.println("Enter the date(DD/MM/YYYY)");
			validateDate(sc.next()); //pass to the method to validate
		}
		catch(Exception ex) {   // for unchecked exception
			System.out.println(ex);
		}
	}
}
