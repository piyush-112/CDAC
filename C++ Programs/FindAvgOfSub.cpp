//Wap to find the average of the three subject upto 2 decimal places;

#include<iostream>
using namespace std;
int main(){
	int s1,s2,s3,total;
	float avg;
	cout<<"Enter the marks of sub s1,s2,s3:";
	cin>>s1>>s2>>s3;
	total=s1+s2+s3;
	cout<<"The total of the subject:"<<total;
	avg=total/3;
	cout<<"\nThe average of the 3 subject:"<<avg<<"\n";

		return 0;
}
