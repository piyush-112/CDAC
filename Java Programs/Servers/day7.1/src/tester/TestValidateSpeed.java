package tester;

import java.util.Scanner;
import static utils.VehicleValidationRules.*;
//import static utils.VehicleValidationRules.validateFuel;

public class TestValidateSpeed {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			
			System.out.println("Enter Fuel to check fuel type");
			validateFuel(sc.next().toLowerCase());
			
			System.out.println("Enter ");
			System.out.println("end of try...");
		} // JVM : sc.close() => clean up of the resources :std i/p stream
		catch (Exception e) {
			System.out.println(e);// name + err mesg
		}
		System.out.println("main over....");

	}

}
