//WAP to find the maximum number of three

#include<iostream>

using namespace std;

int main(){
	int n1,n2,n3;
	int x;
	cout<<"Enter the number:";
	cin>>n1>>n2>>n3;
	{
	x = (n1>n2)?(n1>n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
	cout<<"the maximum number is"<<x;
	}
	return 0;
}

