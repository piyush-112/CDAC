package Comparable;
import java.util.*;

public class CompareToApp {

	public static void main(String[] args) {
		ArrayList<EmployeeComparable> EmpList=new ArrayList<EmployeeComparable>();
		EmpList.add(new EmployeeComparable(1,"Ram",621250));
		EmpList.add(new EmployeeComparable(2,"Shivray",289000));
		EmpList.add(new EmployeeComparable(3,"Karn",703000));
		EmpList.add(new EmployeeComparable(4,"Shabri",5001550));
		System.out.println(EmpList);   //before creating the toString() it will show the hashcode of the object
		Collections.sort(EmpList);
		System.out.println(EmpList);
	}

}
