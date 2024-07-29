//WAp to find the maximun number out of two number using pass reference

#include<iostream>
using namespace std;

void max(int num1,int num2,int &res){
	(num1>num2)?res=num1:res=num2;
}

int main(){
	int num1;
	int num2;
	int res;
	cout<<"Enter the number:";
	cin>>num1>>num2;
	max(num1,num2,res);
	cout<<"The maximun number is:"<<res<<endl;
	return 0;
}
