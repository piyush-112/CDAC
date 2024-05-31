
class Rectangle{
		public double length;
		public double breadth;
		
		public double area() {
			return length*breadth;
		}
		
		public double perimeter() {
			return 2*(length+breadth);
		}
		
		public boolean isSquare()
		{
			if(length==breadth)
				return true;
			else
				return false;
		}
		
	}

public class rectangleclassusintmethods {
public static void main(String[] args) {
	
	Rectangle r=new Rectangle();
	r.length=10.5;
	r.breadth=5.5;
	
	System.out.println("area "+r.area());
	System.out.println("permieter "+r.perimeter());
	System.out.println("Is it a square "+r.isSquare());
}
}
