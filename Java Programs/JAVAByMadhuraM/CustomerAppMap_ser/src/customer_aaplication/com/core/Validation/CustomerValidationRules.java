package customer_aaplication.com.core.Validation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import customer_aaplication.com.core.Customer;
import customer_aaplication.com.core.Plan;

/*no dup customers 
(i.e if the customer tries to register using existing email , raise custom exception)

4.2 Validate plan
plan must be of supported types

4.3 reg amount must match with the plan*/
public class CustomerValidationRules {
	public static Customer finalValidation(HashMap<String,Customer> customer,String fName, String lName, String email, String password, String plan, double regiAmount,
		String dob,String d) throws InvalidCustomerException,DateTimeParseException
	{
		notExistingEmail(customer,email);
		Plan p=validatePlan(plan);
		validateAmount(p,regiAmount);
		
		return new Customer(fName, lName, email, password, p, regiAmount, LocalDate.parse(dob),LocalDate.parse(d));
		
	}
	
public static void notExistingEmail(HashMap<String, Customer> customer,String otherEmail) throws InvalidCustomerException
{
	Customer c1=customer.get(otherEmail);
	if(c1!=null)
		throw new InvalidCustomerException("customer already exist");
	
}
public static Plan validatePlan(String s)throws IllegalArgumentException,InputMismatchException {
	Plan temp=Plan.valueOf(s.toUpperCase());
	return temp;
}
public static void validateAmount(Plan type,double amount) throws InvalidCustomerException
{
	if(type.getAmount()>amount)
		throw new InvalidCustomerException("Amount not sufficint for this plan please chek plan details again");
	
}



    public static String isValidEmail(String email) throws InvalidCustomerException {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+(?:org|in|com)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
       if(matcher.matches())
       {
    	   return email;
       }
       else
       {
    	   throw new InvalidCustomerException("Please Provide valid email");
       }
     
    }
    public static String isValidPassword(String password) throws InvalidCustomerException {
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
        {
        	return password;
        }
        else
        {
        	throw new InvalidCustomerException("Password must alphanumeric");
        }
    }
    }

