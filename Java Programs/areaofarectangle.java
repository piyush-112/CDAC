
class rectangle{
	
	private int length;
	private int breadth;
	
	
	int getLength() {
		return length;
	}
	
	int getBreadth(){
		return breadth;
	}
	
	void setLength(int l) {
		length=l;
	}
	
	void setBreadth(int b) {
		breadth=b;
	}
	
	
	public int area() {
		return length*breadth;
	}
	public int perimeter() {
		return (2*(length*breadth));
	}
}

public class areaofarectangle {	
public static void main(String[] args) {
	
	rectangle r = new rectangle();
	r.setLength(15);
	r.setBreadth(5);
	System.out.println(r.area());
	System.out.println(r.perimeter());
	
	System.out.println(r.getLength());
	System.out.println(r.getBreadth());
	
	
	
}
}
