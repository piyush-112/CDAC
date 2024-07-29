//Swapping of two number using third variable
//i/p a=12 b=10 o/p a=10 b=12

#include<iostream>
using namespace std;
int main(){
	int a;
	int b;
	cout<<"Enter the 2 number:"<<endl;
	cin>>a;
	cin>>b;
	int temp=a;
	a=b;
	b=temp;
	cout<<"The number after the swapping:"<<endl;
	cout<<"A="<<a<<endl;
	cout<<"B="<<b<<endl;
	return 0;
}
