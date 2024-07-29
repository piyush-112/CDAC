#include<iostream>
#include "empheader.h"
using namespace std;

int emp::count;

emp::emp()
{
	id=101;
	nm="Aniket";
	count++;
}
emp::emp(int i,string name){
	id=i;
	nm=name;
	count++;
}

void emp::display(){
	cout<<"emp id:"<<id<<" "<<"Emp Name: "<<nm<<endl;
}
/*
void emp::showcount(){
	cout<<"Num of Obj:"<<count<<endl;
}
*/
