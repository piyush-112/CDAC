//WAP to calculate the power of the given number
//i/p =2 o/p=4

#include<iostream>
using namespace std;
int main(){
	int num, n;
	double p=1;
	cout<<"Enter the number: ";
	cin>>num;
	cout<<"Enter power= ";
	cin>>n;
	while(n!=0){
		p=p*num;
		n--;
	}
	cout<<"The power of the given number is:"<<p<<endl;
	return 0;
}
