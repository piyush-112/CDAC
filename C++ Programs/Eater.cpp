//CPP prgram for eater

#include<iostream>
#include<cstring>
using namespace std;
int main(){
	int id;
	string nm;
	//Eater in cpp 
	cout<<"Enter the id of the Student:";
	cin>>id;
	cout<<"Enter the name of the student";
	cin.get();
	getline(cin,nm);
	cout<<id<<"\t"<<nm;
}
