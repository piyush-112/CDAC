package utils;
import tester.*;
import custom_exceptions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class LicenceValidation {
	public static void validateDate1(String date) throws LicenceExpiryException, ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date D1 = sdf.parse(date);
		Date currdate=new Date();//get curr date
		System.out.println(currdate);
//		System.out.println(D1.before(currdate));
		if(D1.before(currdate))
			throw new LicenceExpiryException("Lic Expired!!");
		if(D1.equals(currdate))
			System.out.println("Today is last day please update lic");
		
		System.out.println("Your lic is valid (till="+date+")");
		 
	}
}
