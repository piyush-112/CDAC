//Write a cpp to check the leap year program 

#include<iostream>
using namespace std;
int main(){
	int year;
	cout<<"Enter the year :";
	cin>>year;
	/*
	if(year%4==0 &&( (year%400==0) || (year/100!=0))){
		cout<<"The given year is a leap year"<<endl;;
	}
	else{
		cout<<"The given year is not leap year :("<<endl;
	}
	*/
	(year%4==0 &&((year%400==0) || (year/100!=0))) ? cout<<"leap" : cout<<"not leap"<<endl;
	return 0;
}
