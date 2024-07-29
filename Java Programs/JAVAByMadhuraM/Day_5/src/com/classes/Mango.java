package com.classes;

public class Mango extends fruit {
	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}
	
//	public String toString() {
//		return super.toString();
//	}
	public String taste() {
		return "sweet";
	}
	public void pulp() {
		System.out.println("name n color of the fruit"+getName()+ getColor()  +"creating  pulp!");
		}
}