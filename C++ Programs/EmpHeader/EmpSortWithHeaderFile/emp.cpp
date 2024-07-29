//emp.cpp here we write a function defination that we dwclare in a emp.h

#include<iostream>
#include "emp.h"

using namespace std;


		//CTOR
		emp::emp()
	       	{
		cout<<"\n CTOR called"<<endl;
		count++;

		id =0;
		name = "";
		sal = 0;
		}
		
		emp::emp(int id, string name, double sal)
	       	{
		cout<<"\n Parameterised CTOR called"<<endl;
		count++;
		this->id=id;
		this->name=name;
		this->sal=sal;
		}

		int emp::getsal()
		{
			return sal;
		}

		void emp::accept()
		{
			cout<<"\n Enter the id of the emp:"<<endl;
			cin>>id;
			cout<<"\n Enter name of the emp:"<<endl;
			cin.get();
			getline(cin, name);
			cout<<"\n Enter the salary of the emp:"<<endl;
			cin>>sal;

		}

		void emp::display() const
		{
			cout<<"\nId:"<<id<<" Name:"<<name<<" salary:"<<sal<<endl;

		}

		void emp::printCount()
		{
		cout<<"\n Count="<<count; 
		}

		emp::~emp()
	       	{
		cout<<"\n DTOR called"<<endl;
		}
	
	int emp::count =0;


