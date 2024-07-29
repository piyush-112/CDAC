package com.cricketer;
//main class for all declaration of class cricketer with following Field

public class cricketer {
	private int counter=1;
	private int pid;
	private String name;
	private int age;
	private String email;
	private String phone;
	private int rating;
	
	public cricketer(String name, int age, String email, String phone, int rating) {
		super();
		this.pid=counter;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.rating = rating;
		counter++;
	}
	

	@Override
	
	public String toString() {
		return "pid=" + pid++ + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", rating=" + rating + "]";
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}

