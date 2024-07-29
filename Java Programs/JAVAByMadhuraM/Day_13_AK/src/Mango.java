
public class Mango extends Fruit {

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}
	public void pulp() {
		System.out.println("name n color of the Fruit"+getName()+getColor()+"Creating pulp!");
	}
}
