package Com.Tester;
import java.util.Scanner; 
import Com.CustException.*;
import static Com.Validation.CarSpeedValidation.*;
public class SpeedFuelTester {

	public static void main(String[] args) throws SpeedOutOfRangeException,FuelNotSupportException {
		try(Scanner sc=new Scanner(System.in)){
			//input the speed 
			System.out.println("Please Enter the Speed:");
			validateSpeed(sc.nextInt()); //pass to the method to validate
			
			System.out.println("Enter the fuel type:");  //input the fuel in the type string
			validateFuel(sc.next());  //validate  the fuel you can also use sc.next().toUppercase() here
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

	

}
