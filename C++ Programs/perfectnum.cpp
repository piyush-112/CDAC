//To check the number is perfect or not
//i/p=28 o/p=number is perfect;

#include<iostream>
using namespace std;
int main(){
	int num;
	int sum=0;
	cout<<"Enter the number:";
	cin>>num;
	for(int i=1;i<num;i++){
		if(num%i==0){
			sum=sum+i;
	}
	}
	cout<<"The sum is:"<<sum<<endl;
	if(sum==num){
		cout<<"The given number is a perfect number:"<<num<<endl;
	}
	else{
		cout<<"The given number ids not the perfect number:"<<num<<endl;
	}
	return 0;
}

