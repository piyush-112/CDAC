package com.classes;

public class Apple extends fruit {
	public Apple(String color,double weight,String name,boolean fresh) {
		super(color,weight,name,fresh);
	}
	public String toString() {
		return super.toString();
	}
	public String taste() {
		return "sweet n sour";
	}
	public void jam() {
	System.out.println("Name of the fruit:"+getName()+ "making jam!");
	}
}
