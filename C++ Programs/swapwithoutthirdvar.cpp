#include<iostream>
using namespace std;
int main()
{
	int a,b;
	cout<<"Enter 2 numbers:"<<endl;
	cin>>a>>b;
	a=a+b;
	b=a-b;
	a=a-b;
	cout<<"After swapping without 3rd variable"<<endl;
	cout<<a<<endl<<b<<endl;
	return 0;
}
