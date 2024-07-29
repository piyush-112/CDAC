//To calulate the avg of the marks using the explicite,implicit conversion

#include<iostream>
using namespace std;
int main(){
	int arr[5];
	int sum=0;
	for(int i=0;i<5;i++){
		cout<<"Enter the subject mark:";
		cin>>arr[i];
		sum+=arr[i];
	}
	cout<<sum<<endl;
	float avg=sum/5.0;
	cout<<"The average of the subject using implicit conversion:"<<avg<<endl;
	int avr=static_cast<int>(avg);
	cout<<"The average of the subject using explicit conversion:"<<avr<<endl;
	return 0;
}
