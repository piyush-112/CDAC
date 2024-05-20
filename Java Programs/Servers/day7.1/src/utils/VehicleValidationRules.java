package utils;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import custom_exceptions.FuelTypeException;
import custom_exceptions.LicenceExpiryException;
import custom_exceptions.SpeedOutOfRangeException;
import enums.FuelEnum;

/*
 * Will contain different method for validation rules
 */
public class VehicleValidationRules {
	// add speed limits as constants
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	public static final String FUEL;
	static {
		// init static data members
		MIN_SPEED = 40;
		MAX_SPEED = 80;
		
		FUEL = "Petrol";
	}

//add public static (since it's not using any instance vars) 
	// method to validate speed
	// can satisfy the javac : using try-catch OR throws
	// using throws : to use centralized exc handling
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("Speed too low !!!!");
		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too high , FATAL !!!!");
		System.out.println("speed within range...");
	}
	
	public static void validateFuel(String fuel) throws FuelTypeException{
//		if(fuel!= "petrol")
//			throw new FuelTypeException("Wrong Fuel!!");
//		System.out.println("Correct Fuel");
		FuelEnum[] fe=FuelEnum.values(); //
		for(FuelEnum f: fe) {
			if(f.toString().equals(fuel)) {
				System.out.println("Supported");
			}
			else {
			throw new FuelTypeException("Not supported fuel!!");
			}
			
		}
		
		
	}
	
	
	
	
} 