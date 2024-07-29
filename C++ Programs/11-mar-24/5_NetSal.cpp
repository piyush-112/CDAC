//Write a CPP program to calculate the net salary 

#include<iostream>
using namespace std;
int main(){
	double bs;
	cout<<"Enter the basic salary of yours:";
	cin>>bs;
	double hra;
	hra=bs*0.15;
	cout <<"The Hra Of yours is:"<<hra<<endl;
	double PF=bs*0.125;
	cout<<"The PF of yours is:"<<PF<<endl;
	double da=bs*0.3;
	cout<<"DA od yours:"<<da<<endl;
	double gross=bs+hra+da;
	cout<<"The Gross salary of yours is:"<<gross<<endl;
	double netsal=gross-PF;
	cout<<"The net salary of yours is:"<<netsal<<endl;
	return 0;
}
