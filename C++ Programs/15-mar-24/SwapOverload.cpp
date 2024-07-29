//Write a cpp program to swap the function usinf the function overloading
#include<iostream>
using namespace std;
void swap(int &n1,int &n2){
	int temp=n1;vi 
	n1=n2;
	n2=temp;
}

void swap(float &num1,float &num2){
	float temp=num1;
	num1=num2;
	num2=temp;
}

int main(){
	int a,b;
	float n1,n2;
	cout<<"Enter the value of int number 1:";
	cin>>a;
	cout<<"Enter the value of int number 2:";
	cin>>b;
	swap(a,b);
	cout<<"integer value after the swapping"<<endl;
	cout<<a<<endl;
	cout<<b<<endl;
	
	cout<<"Enter the value of float number 1:";
	cin>>n1;
	cout<<"Enter the value of float number 2:";
	cin>>n2;
	cout<<"The number after swapping with ref:"<<endl;
	swap(n1,n2);
	cout<<n1<<endl;
	cout<<n2<<endl;
	return 0;
}

