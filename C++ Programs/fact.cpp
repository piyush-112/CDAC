//Write a function for factorial and use the function for printing factorial series like 1 2 6 24 120

#include<iostream>
using namespace std;

void fact(int num){
	float res=1;
	for(int i=1;i<=num;i++){
		res=res*i;
		cout<<res<<endl;
	}
}
int main(){
	int num;
	cout<<"enter the number:"<<endl;
	cin>>num;
	fact(num);
	//return 0;
}
