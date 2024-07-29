package com.classes;
/*
  Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
Use tight encapsulation.
color : String , weight : double , name:String, fresh : boolean
 */
public class fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	public fruit(String color,double weight,String name,boolean fresh) {
		super();
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.fresh=fresh;
	} 
	public String toString() {
		return "Color is: "+color+ " Weight is: "+weight+" Name of the fruit: "+name/*+"Fresh"+fresh*/;
	}
	//Getter setter of the super class:
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public String taste() {
		return "no specific taste";
	}

}


