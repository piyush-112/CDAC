//WAP for prime number

#include<iostream>
using namespace std;
int main(){
	int num=0;
	int count=0;
	cout<<"Enter the number:";
	cin>>num;
	int x=num/2i;
	for(int i=0;i<x;i++){
		if(num%i==0){
			count++;
		}
	}
	if(count==2){
		cout<<"entered number is prime number"<<endl;
	}
	else{
		cout<<"entered number is not prime number"<<endl;
	}
	return 0;
}
