//File for the definition

#include "stud.h"

void student :: accept(){
	cout<<"Enter the Roll Number of the student:"<<endl;
	cin>>roll;
	cout<<"Enter the name of the Student:"<<endl;
	cin>>name;
}

void student :: display(){
	cout<<"Roll No:"<<roll<<endl;
	cout<<"Name :"<<name<<endl;
}
