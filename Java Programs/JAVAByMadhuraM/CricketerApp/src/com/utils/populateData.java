package com.utils;

import java.util.HashMap;
import java.util.Map;

import com.cricketer.cricketer;

public class populateData {

	public static Map<Integer, cricketer> populate() {
		HashMap<Integer,cricketer> mymap=new HashMap<>();
		mymap.put(1,new cricketer("Dhoni",41,"msdhoni@gmail.com","9139957750",9));
		mymap.put(2,new cricketer("Virat",32,"viratk@gmail.com","8090231516",8));
		mymap.put(3,new cricketer("Rohit",35,"rohits@gmail.com","9226891332",8));
		mymap.put(4,new cricketer("Ajinkya",31,"ajinkyar@gmail.com","9226802552",7));
		mymap.put(5,new cricketer("Hardik",29,"hpandya@gmail.com","8090891332",5));
		mymap.put(6,new cricketer("Rohit",35,"rohits@gmail.com","9226800000",6));
		return mymap;
	}

}
