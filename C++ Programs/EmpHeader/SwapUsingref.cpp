//WAP to swap function for integers using ref

#include<iostream>
using namespace std;
void swap(int &n1,int &n2){
	int temp=n1;
	n1=n2;
	n2=temp;
}
int main(){
	int a;
	int b;
	cout<<"Enter the num 1:";
	cin>>a;
	cout<<"Enter the num 2:";
	cin>>b;
	cout<<"The number before swapping:"<<endl;
	cout<<a<<endl;
	cout<<b<<endl;
	cout<<"The number after swapping with ref:"<<endl;
	swap(a,b);
	cout<<a<<endl;
	cout<<b<<endl;
	return 0;
}
