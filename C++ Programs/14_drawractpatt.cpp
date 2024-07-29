//WAP to draw a ractanle 
//take the l,b from the user


#include<iostream>
using namespace std;
int main(){
	int len;
	int bre;
	cout<<"Enter the value of the length:";
	cin>>len;
	cout<<"Enter the value of the breadth:";
	cin>>bre;
	for(int i=0;i<len;i++){
		for(int j=0;j<bre;j++){
			if(i==0 || i==len-1 || j==0 || j==bre-1 ){
				cout<<"*";
			}
			else{
				cout<<" ";
			}
		}
		cout<<"\n";
	}
	return 0;
}
