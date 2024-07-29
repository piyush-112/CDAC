package Serialization;

import java.io.Serializable;

public class studentApp implements Serializable {
	private int id;
	private String name;
	//if you dont want to store the age data into file then in that case you can use the "Transient" keyword to do that so
//	 transient private int age;
	 private int age;
	
	public studentApp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayname() {
		System.out.println("Hi  there my name is"+this.getName());
	}

}
