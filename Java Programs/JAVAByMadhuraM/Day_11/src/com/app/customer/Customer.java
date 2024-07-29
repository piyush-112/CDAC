package com.app.customer;
	import java.time.LocalDate;  
	import java.util.*;
	public class Customer {
		private static int cid=100;
		private String fName;
		private String lName;
	    private String email;
		private String pass;
		private double regAmount;
		private LocalDate dob;
		private ServicesPlan plan;
		
//		Create ctor
		public Customer(String fName, String lName, String email, String pass, double regAmount, LocalDate dob,
				ServicesPlan plan) {
			super();

			this.fName = fName;
			this.lName = lName;
			this.email = email;
			this.pass = pass;
			this.regAmount = regAmount;
			this.dob = dob;
			this.plan = plan;
		}
		@Override
		    public String toString() {
		        return "Customer ID: " + cid++ + "\n" +
		                "Name: " + fName + " " + lName + "\n" +
		                "Email: " + email + "\n" +
		                "Registration Amount: $" + regAmount + "\n" +
		                "Date of Birth: " + dob + "\n" +
		                "Plan: " + plan;
		    }
		
		@Override
		public boolean equals(Object o) {
			System.out.println("in acct's equals");
			if (o instanceof Customer) {
				Customer a = (Customer) o;
				return this.cid == a.cid;
			}
			return false;
		}
		public static int getCid() {
			return cid;
		}
		public static void setCid(int cid) {
			Customer.cid = cid;
		}
		public String getfName() {
			return fName;
		}
		public void setfName(String fName) {
			this.fName = fName;
		}
		public String getlName() {
			return lName;
		}
		public void setlName(String lName) {
			this.lName = lName;
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
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public ServicesPlan getPlan() {
			return plan;
		}
		public void setPlan(ServicesPlan plan) {
			this.plan = plan;
		}
		
		
		
	}
