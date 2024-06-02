
class Rectangle2{
	
	private int length;
	private int breadth;
	
	public Rectangle2() {
		length=1;
		breadth=1;
	}
	
	public Rectangle2(int l, int b) {
		length=l;
		breadth=b;
	}
	
	
//	int getLength() {
//		return length;
//	}
//	
//	int getBreadth(){
//		return breadth;
//	}
//	
//	void setLength(int l) {
//		length=l;
//	}
//	
//	void setBreadth(int b) {
//		breadth=b;
//	}
	
	
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return (2*(length*breadth));
	}
}

public class areaofaresctangleusingconstructor {	
public static void main(String[] args) {
	
	Rectangle2 r = new Rectangle2(15,5);
//	r.setLength(15);
//	r.setBreadth(5);
	System.out.println(r.area());
	System.out.println(r.perimeter());
	
//	System.out.println(r.getLength());
//	System.out.println(r.getBreadth());
	
	
	
}
}
