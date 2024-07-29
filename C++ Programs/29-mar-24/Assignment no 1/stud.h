//Header file of student i.e. Declaration

#ifndef STUD_H
#define STUD_H
#include<iostream>
#include<fstream>
using namespace std;

class student{
	int roll;
	char name[100];
	public:
		void accept();
		void display();
};
#endif
