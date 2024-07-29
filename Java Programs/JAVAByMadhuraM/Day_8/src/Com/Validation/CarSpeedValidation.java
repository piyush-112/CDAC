package Com.Validation;
import Com.CustException.*;
import FuelEnum.*;
public class CarSpeedValidation {
	public static final int MAX_SPEED;
	public static final int MIN_SPEED;
	static {
		MAX_SPEED=90;
		MIN_SPEED=50;
	}
	//static method for the validating the speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException {
		if(speed<50) {
			throw new SpeedOutOfRangeException("Your speed is too low !please raise teh speed!");
		}
		if(speed>90) {
			throw new SpeedOutOfRangeException("Your Speed is too high!Please Slow Down");
		}
		System.out.println("You are in limit!keep it in range");
	}
	//static method for validating the fuel
	public static void validateFuel(String name) throws FuelNotSupportException {
		//FEnum fe[]=FEnum.values();
		boolean flag=false;
		for(FEnum f:FEnum.values()) {
			if(f.toString().equals(name)) {
				//throw new FuelNotSupportException("Fuel are supported");
				flag=true;
				break;
			}
		}
		if(!flag) {
			throw new FuelNotSupportException("Fuel not Supported");
		}
		else {
			System.out.println("Supported");
		}
	}
	
}
