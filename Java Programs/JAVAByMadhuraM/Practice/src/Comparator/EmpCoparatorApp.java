package Comparator;

import java.util.ArrayList;
import java.util.Collections;

import Comparator.IdComparaotor;

public class EmpCoparatorApp {

	public static void main(String[] args) {
			ArrayList<Emp> EmpList=new ArrayList<>();
			EmpList.add(new Emp(1,"Ram",621250));
			EmpList.add(new Emp(2,"Shivray",289000));
			EmpList.add(new Emp(3,"Karn",703000));
			EmpList.add(new Emp(4,"Shabri",5001550));
			System.out.println(EmpList);   //before creating the toString() it will show the hashcode of the object
			//sort by id using custom sorting method comparator
			Collections.sort(EmpList,new IdComparaotor());
			System.out.println(EmpList);
			//Sort by name comparator allow us to sort by multiple parameters
			ArrayList<Emp> EmpList1=new ArrayList<Emp>(EmpList);
			Collections.sort(EmpList1,new nameComparator());
			System.out.println(EmpList1);
	}
}
