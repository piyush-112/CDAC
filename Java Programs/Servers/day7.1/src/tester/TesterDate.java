package tester;
import static utils.LicenceValidation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import custom_exceptions.*;
@SuppressWarnings("unused")
public class TesterDate {
	public static void main(String[] args) throws LicenceExpiryException, ParseException {
		try(Scanner sc = new Scanner(System.in)){
//			Date d1=new Date();//curr date
//			Date currdate=d1;
//			System.out.println(currdate); 
			System.out.println("Enter Date (dd/mm/yyyy)");
			validateDate1(sc.next());
		}
	}
}
