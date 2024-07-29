//*
//**
//***
//****
//*****


#include<iostream>
using namespace std;
int main(){
	int num;
	cout<<"Enter the number";
	cin>>num;
	for(int i=num;i>0;i--){
		for(;i<=num;i++){
			cout<<"*";
		}
		cout<<endl;
	}
}
