//WAP to do a default and placeholder argument in program
#include<iostream>
using namespace std;
int add1(int a,int b){
	return a+b;
}
//default agrument
int add2(int a,int b,int c=0){
	return a+b+c;
}
//Placeholder agrument
int add3(int a,int b,int){
	return a+b;
}

int main(){
	int n1,n2,n3;
	cout<<"Enter the number n1,n2,n3:";
	cin>>n1>>n2>>n3;
	int res1=add1(n1,add1(n1,n3));
	int res2=add2(n1,n2);
	int res3=add3(n1,n2,n3);
	cout<<res1<<"   "<<res2<<"    "<<res3<<endl;	
	return 0;
}
