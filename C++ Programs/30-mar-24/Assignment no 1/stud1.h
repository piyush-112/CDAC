//Header file

#ifndef STUD1_H
#define STUD1_h
#include<iostream>
#include<fstream>
#include<stdexcept>
using namespace std;
class stud{
	int id;
	char name[50];
	int age;
	public:
	void Accept();
	void Display();
};
#endif
