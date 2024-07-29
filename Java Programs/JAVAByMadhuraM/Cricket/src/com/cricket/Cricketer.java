package com.cricket;

public class Cricketer 
{
	private String crickterName;
	private int age;
	private String emailId;
	private String phoneNumber;
	private int ratings;
	public Cricketer(String crickterName, int age, String emailId, String phoneNumber, int ratings) {
		super();
		this.crickterName = crickterName;
		this.age = age;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.ratings = ratings;
	}
	public String getCrickterName() {
		return crickterName;
	}
	public int getAge() {
		return age;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getRatings() {
		return ratings;
	}
	
	
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Cricketer [crickterName=" + crickterName + ", age=" + age + ", emailId=" + emailId + ", phoneNumber="
				+ phoneNumber + ", ratings=" + ratings + "]";
	}
	
	
}
