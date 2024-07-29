package mainCustomer;

public class CustomerApp {
	private final int customerID;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private double regAmount;
	private String dob;
	private ServicePlan plan;
	public CustomerApp(int customerID,String fname, String lname, String email, String pass, double regAmount, String dob,
			ServicePlan plan) {
		super();
		this.customerID=customerID;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.regAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	@Override
	public String toString() {
		return "CustomerApp [+"+"Customer ID: "+customerID+"+first name=" + fname + ", last name=" + lname + ", email=" + email +
				", regAmount=" + regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	  public int getCustomerID() {
	        return customerID;
	    }
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getRegAmount() {
		return regAmount;
	}
	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public ServicePlan getPlan() {
		return plan;
	}
	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	
}
