package Validations;
import CustomException.*;

import java.time.LocalDate;
import java.util.HashMap;

import mainCustomer.CustomerApp;
import mainCustomer.ServicePlan;

public class CustomerValidationApp {
	//method statically checking the i/p correct or not
	//for mailID
	private static boolean isValidEmail(String email) {
        return email.contains("@") && (email.endsWith(".com") || email.endsWith(".org") || email.endsWith(".net"));
    }
	
	//for password
    private static boolean isValidPassword(String password) {
        return password.matches("[a-zA-Z0-9]+");
    }
    
    //for checking the planValidation
    private static boolean isValidPlan(ServicePlan plan) {
        return plan == ServicePlan.SILVER || plan == ServicePlan.GOLD || plan == ServicePlan.DIAMOND || plan == ServicePlan.PLATINUM;
    }
    
	public static CustomerApp ValidateInput(int customerId,String fName, String lName, String email, String pass, double regAmount, String dob,
			ServicePlan plan,HashMap<String,CustomerApp>hm) throws NoDuplicateCustomer,Exception{
		   if (!isValidEmail(email)) {
	            throw new Exception("Invalid email format.");
	        }
	        if (!isValidPassword(pass)) {
	            throw new Exception("Password must be alphanumeric.");
	        }
	        if (hm.containsKey(email)) {
	            throw new NoDuplicateCustomer("Email already registered.");
	        }
	        if (!isValidPlan(plan) && regAmount != plan.getcost()) {
	            throw new Exception("Invalid service plan.");
	        }
	        return new CustomerApp(fName,lName,email, pass,regAmount, LocalDate.parse(dob) ,
			ServicesPlan.valueOf(plan))
	}

	
	  //////done
}
