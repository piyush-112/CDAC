//Write a program using function to obtain the running sum of n numbers
#include<iostream>
using namespace std;
int n;
void sum(int n){
	int addition=0;
	for(int i=1;i<=n;i++){
		addition=addition+i;
	}
	cout<<"the sum of the number :"<<addition<<endl;
}

int main()
{
	int n;
	cout<<"Enter the number upto you which to print the sum:"<<endl;
	cin>>n;
	sum(n);
	return 0;
}
