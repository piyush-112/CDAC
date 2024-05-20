package utils;

import java.util.*;
import custom_exceptions.SpeedRulesException;

public class VehicleDrivingRules {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	static {
		MIN_SPEED= 40;
		MAX_SPEED= 100;
		
	}
	
	public static void validateSpeed(int speed) throws SpeedRulesException{
		if(speed < MIN_SPEED)
			throw new SpeedRulesException("Speed too Low");
		if(speed > MAX_SPEED)
			throw new SpeedRulesException("Speed too High");
		
		System.out.println("Speed within Range");
		
		}
}
