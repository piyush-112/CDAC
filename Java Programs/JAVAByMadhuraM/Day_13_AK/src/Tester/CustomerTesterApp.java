package Tester;
import java.util.*; 
import mainCustomer.*;
import Validations.*;
import CustomerValidationApp.CustomerApp ValidateInput.*;
public class CustomerTesterApp {
	public static void main(String x[]) {
		try(Scanner sc=new Scanner(System.in)){
			HashMap<String,CustomerApp> hm=new HashMap<>();
			boolean exit=false;
			int nextCustomerId=1;
			while(!exit) {
				System.out.println("Option:\n"+
									"1. Sign up (customer registration)\n"+
									"2. Sign in (login)\n"+
									"3. Change password\n"+
									"4. Un subscribe customer\n"+
									"5. Display all customers."+
									"6. Exit ");
				System.out.println("Please enter your choice:");
				try {
					switch(sc.nextInt()) {
					case 1:
						//String fName, String lName, String email, String pass, double regAmount, LocalDate dob,
						System.out.println("Enter Customer Details:\n");
						System.out.println("Enter the First Name of the customer:");
						String fname=sc.next();
						System.out.println("Enter the Last name of the customer:");
						String lname=sc.next();
						System.out.println("Enter the Email of the customer:");
						String email=sc.next();
						System.out.println("Enter the password:");
						String pass=sc.next();
						System.out.println("Ente the RegisterAmount:");
						double regAmount=sc.nextDouble();
						System.out.println("Enter the date of the birth: YYYY/MM/DD");
						String dob=sc.next();
						System.out.println("Enter the Plan:SILVER/GOLD/PLATINUM/DIAMOND");
						String plan=sc.next().toUpperCase();
						int customerId = nextCustomerId++;
						CustomerApp details=CustomerValidationApp.ValidateInput(customerId,fname, lname, email, pass, regAmount, dob, plan,hm);
						hm.put(details.getEmail(), details);
						break;
						
					case 2:
						break;
						
					case 3:
						break;
						
					case 4:
						break;
						
					case 5:
						break;
						
					case 6:
						break;
						
					default:
						System.out.println("Please enter valid choice:");
							
					}
					
				}catch(Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}
}
