package com.classes;

public class Orange extends fruit {
	public Orange(String color,double weight,String name,boolean fresh) {
		super(color,weight,name,fresh);
	}
	public String toString() {
		return super.toString();
	}
	public String taste() {
		return "sour";
	}
	public void juice() {
	System.out.println("name and weight of the fruit:"+getName()+getWeight()+" extracting juice!");
	}
}
