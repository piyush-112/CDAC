import java.util.Scanner;

public class MangoPulpNotAbstractApp {
	/*
	 * 1. MUST TRY THIS TODAY 1st thing in the lab
Given : Fruit class in not abstract.
Fruit f=new Mango(...);
f.pulp();
//what will happen in above case ??? n can you solve the error ?

Try it out n we will discuss tomorrow !
Mango m=new Fruit();
m.pulp();this.color=color;
		this.weight=weight;
		this.color=color;
	 */
	public static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color ,wight and name of the fruit: ");
//		Fruit f=new Mango(sc.next(),sc.nextDouble(),sc.next());
//		//f.pulp();
//		System.out.println(f.toString());
		Mango m=new Mango(sc.next(),sc.nextDouble(),sc.next());
		//Mango m=new Fruit(sc.next(),sc.nextDouble(),sc.next());
		m.pulp();
	}
	
}
