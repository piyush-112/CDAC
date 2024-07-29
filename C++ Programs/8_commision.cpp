//Write a Program to calulate the basic salary according to the ranges;

#include<iostream>
using namespace std;
int main(){
	double bassal;
	double salamt;
	double salary;
	cout<<"Enter the basic salary:";
	cin>>bassal;
	cout<<"Enter thr sales amount:";
	cin>>salamt;
	double commision=0;
	if(salamt>5000 && salamt<7500){
		commision=salamt*0.3;
		cout<<"The commision is:"<<commision<<endl;
		salary=bassal+commision;
		cout<<"Salary:"<<salary<<endl;
	}
	else if(salamt>7501 && salamt<10500){
		commision=salamt*0.8;
		cout<<"The commision is:"<<commision<<endl;
		salary=bassal+commision;
		cout<<"salary"<<salary<<endl;
	}
	else if(salamt>10501 && salamt<15000){
		commision=salamt*0.11;
		cout<<"The commision is:"<<commision<<endl;
		salary=bassal + commision;
		cout<<"Salary"<<salary<<endl;
	}
	else{
		commision=salamt*0.15;
		cout<<"The Commision  is:"<<commision<<endl;
		salary=bassal + commision;
		cout<<"Salary:"<<salary<<endl;	
	}
	return 0;
}
