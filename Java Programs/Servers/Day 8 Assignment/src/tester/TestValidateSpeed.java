package tester;

import java.util.Scanner;
import static utils.VehicleValidationRules.*;

public class TestValidateSpeed {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());
			
			System.out.println("Enter Fuel to check fuel type");
			validateFuel(sc.next().toUpperCase());
			
			System.out.println("Enter Date (dd/mm/yyyy)");
			validateDate(sc.next());
			
			System.out.println("end of try...");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
