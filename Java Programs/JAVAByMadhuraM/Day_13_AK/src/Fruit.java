//super class
public class Fruit {
	private String color;
	private double weight;
	private String name;
	public Fruit(String color,double weight,String name) {
		this.color=color;
		this.weight=weight;
		this.name=name;
	}
	public String toString() {
		return color+"\t"+weight+"\t"+color;
	}
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
}
