package Basics;

import java.util.Scanner;

/*
 * Use of the array of reference
 * create class student accept the id,name from user and display
 */
public class ArrOfRefStudApp {
	private int id;
	private String nm;

	// Constructor to initialize object
	public ArrOfRefStudApp(int id, String nm) {
		this.id = id;
		this.nm = nm;
	}

	// method for display the details of the student :
	public void show() {
		System.out.println("The id :" + id);
		System.out.println("The name :" + nm);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Accepting the number of student
		System.out.println("Enter the number of student:");
		ArrOfRefStudApp stud[] = new ArrOfRefStudApp[sc.nextInt()]; // create the ref of the class ArrOfRefStudApp
		int id;
		String nm;
		// Accepting the value from the user
		for (int i = 0; i < stud.length; i++) {
			System.out.println("Enter the id of the student :");
			id = sc.nextInt();
			System.out.println("Enter the name of the student:");
			nm = sc.next();
			stud[i] = new ArrOfRefStudApp(id, nm);
		}
		// Display the student details
		for (int i = 0; i < stud.length; i++) {
			System.out.print("Student" + (i + 1) + "details:\n");
			stud[i].show();
		}

	}

}
