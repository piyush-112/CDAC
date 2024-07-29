// Get four digit number from the user and count the sum of the digit
// i/p=1234 o/p=10 ;

#include<iostream>
using namespace std;

int  addition(int a)
{
	int temp=a;
       	int sum=0;
	int rem=0;
	while(temp!=0)
	{
		rem=temp%10;
		sum=sum+rem;
		temp=temp/10;
	}
	return sum;	
}
int main()
{
	int num;
	int result=0;	
	cout<<"Enter the four digit number :";
	cin>>num;
	result=addition(num);
	cout<<"The sum of digit:"<<result;
	return 0;
}
