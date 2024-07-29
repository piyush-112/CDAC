package com.tester;

import java.util.Scanner;

import com.developers.geometry.Point2D;

public class TestPoints {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X1 and Y1:");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		System.out.println("Enter the X2 and Y2:");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		Point2D pd1=new Point2D(x1,y1);     //Create the 1st obj and pass x1,y1;
		System.out.println("The First Coordinate of object:"+pd1.show());    //call show method
		Point2D pd2=new Point2D(x2,y2);     //Create the 1st obj and pass x2,y2;
		System.out.println("The First Coordinate of object:"+pd2.show());
		if(pd1.isEqual(pd2)){                //check the coorinate same or not
			System.out.println("The Coordinate are same!");
		}
		else{
			double distance=pd1.calDist(pd2);    //if not calculate the distance 
			System.out.println("The Distance between coordinate are:"+distance);
		}
		sc.close();
	}

}
