package customer_aaplication.com.core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

import customer_aaplication.com.core.Validation.InvalidCustomerException;

/*1.Customer should be assigned system generated (auto increment) customer id : int
Store - first name, last name email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
Unique ID - email*/
public class Customer implements Serializable {
	private static int count = 0;
	private int customerId;
	private String fName;
	private String lName;
	private String email;
	private String password;
	private Plan plan;
	private double regiAmount;
	private LocalDate dob;
	private LocalDate doc;
	private boolean subscribe = true;

	public Customer(String fName, String lName, String email, String password, Plan plan, double regiAmount,
			LocalDate dob, LocalDate doc) {
		super();
		this.customerId = ++count;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.plan = plan;
		this.regiAmount = regiAmount;
		this.dob = dob;
		this.doc = doc;
	}

	public Customer(String email, String string, String string2, String string3, Plan gold, int i, LocalDate localDate,
			LocalDate localDate2) {
		super();
		this.email = email;
	}

	public LocalDate getDoc() {
		return doc;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", password=" + password + ", plan=" + plan + ", regiAmount=" + regiAmount + ", dob=" + dob + ","
				+ (subscribe ? "Subscribe" : "Unsubscribe") + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email);
	}

	public static Customer existingEmail(HashMap<String, Customer> customer, String otherEmail)
			throws InvalidCustomerException {
		Customer n1 = customer.get(otherEmail);
		if (n1 == null)
			throw new InvalidCustomerException("customer not exist");
		return n1;
	}

	public boolean validPassword(String s) throws InvalidCustomerException {

		if (this.password.equals(s))
			return true;
		else
			throw new InvalidCustomerException("password not match");
	}

	public void changePassword(String next) {
		this.password = next;

	}

	public void unsub() {
		this.subscribe = false;
		System.out.println("UnSubscribed");

	}

	public static int getCount() {
		return count;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Plan getPlan() {
		return plan;
	}

	public double getRegiAmount() {
		return regiAmount;
	}

	public LocalDate getDob() {
		return dob;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

}
