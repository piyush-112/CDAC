package contact;

import java.time.LocalDate;

public class Contact {
	
	private String phoneNo;
	private String name;
	private LocalDate dateOfBirth;
	private String email;
	
	public Contact(String phoneNo, String name, LocalDate dateOfBirth, String email) {
		super();
		this.phoneNo = phoneNo;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", Email=" + email
				+ "]";
	}
	
	

}
