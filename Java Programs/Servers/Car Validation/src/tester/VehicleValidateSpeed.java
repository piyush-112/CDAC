package tester;

import java.util.Scanner;
import static utils.VehicleDrivingRules.*;
import static utils.VehicleDrivingRules.validateSpeed;

public class VehicleValidateSpeed {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter current speed");
			validateSpeed(sc.nextInt());

			System.out.println("end of try...");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}
}