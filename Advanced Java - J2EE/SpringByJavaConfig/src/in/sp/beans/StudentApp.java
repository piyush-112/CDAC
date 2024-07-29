package in.sp.beans;

public class StudentApp {
	private String name;
	private int roll;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void Display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no:"+roll);
		System.out.println("Email id:"+email);
	}
}
