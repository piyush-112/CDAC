
class Student{
	
	public int roll;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	public int total() {
		return m1+m2+m3;
	}
	
	public int average() {
		return total()/3;
	}
	
	public String grade() {
		if(total()>=60)
		return "A";
		else if(total()<60 && total()>35)
			return "B";
		return grade();
	}
	
//	public String details() {
//		return"Roll no: "+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
//	}
	
	public String toString() {
		return"Roll no: "+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
	
	
}
public class sampleprogramusingmethods {
public static void main(String[] args) {
	
	Student s = new Student();
	s.m1=10;
	s.m2=20;
	s.m3=30;
	s.roll=1;
	s.name="John";
	s.course="CS";
	
	System.out.println("Total is "+s.total());
	System.out.println("Average is "+s.average());
	System.out.println("Grade is "+s.grade());
//	System.out.println("Details:\n"+s.details());
	System.out.println("Details:\n"+s);
}
}
