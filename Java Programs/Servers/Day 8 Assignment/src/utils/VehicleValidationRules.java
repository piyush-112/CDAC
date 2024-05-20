package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import custom_exceptions.FuelTypeException;
import custom_exceptions.LicenceExpiryException;
import custom_exceptions.SpeedOutOfRangeException;
import enums.FuelEnum;

public class VehicleValidationRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
//	public static final String FUEL;
	
	static {
		MIN_SPEED = 40;
		MAX_SPEED = 100;
//		FUEL = "Petrol";
	}
	
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too Low");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too High");
		System.out.println("Speed within range");
	}
	
	public static void validateFuel(String fuel) throws FuelTypeException{
//		FuelEnum[] fe = FuelEnum.values();
//		for(FuelEnum f: fe) {
//			if(f.toString().equals(fuel)) {
//				System.out.println("Supported");
//				
//			}
//			else {
//				throw new FuelTypeException("Not Supported fuel!");
//			
//			}
//		}
		
//		//FuelEnum[] fe = FuelEnum.values();
//	    boolean supported = false;
//	    for (FuelEnum f : fe) {
//	        if (f.toString().equals(fuel)) {
//	            supported = true;
//	            break; // No need to continue once supported fuel is found
//	        }
//	    }
//	    if (!supported) {
//	        throw new FuelTypeException("Not Supported fuel!");
//	    } else {
//	        System.out.println("Supported");
//	    }
		
		boolean isSupported = false;
	    for (FuelEnum f : FuelEnum.values()) {
	        if (f.toString().equals(fuel)) {
	            isSupported = true;
	            break;
	        }
	    }
	    if (!isSupported) {
	        throw new FuelTypeException("Not Supported fuel!");
	    } else {
	        System.out.println("Supported");
	    }
		
//		 boolean isSupported = false;
//		    for (FuelEnum f : FuelEnum.values()) {
//		        System.out.println("Comparing: " + f.toString() + " with " + fuel);
//		        if (f.toString().equals(fuel)) {
//		            isSupported = true;
//		            break;
//		        }
//		    }
//		    if (!isSupported) {
//		        throw new FuelTypeException("Not Supported fuel!");
//		    } else {
//		        System.out.println("Supported");
//		    }
		
		
	}
	
	public static void validateDate(String date) throws LicenceExpiryException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date d1 = sdf.parse(date); //converting user entered expiry date to date type
		Date curr_date = new Date(); //Get current date
		System.out.println("Curr_date");
		if(d1.before(curr_date))
			throw new LicenceExpiryException("Lic Expired!!");
		if(d1.equals(curr_date))
			System.out.println("Today is last day please update lic");
		
		System.out.println("Your lic is valid (till="+date+")");
		
	}

}
