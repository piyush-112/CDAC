//WAP  to print the character into the apposite case and  flash the error if not in char range

#include<iostream>
using namespace std;
int main(){
	char ch;
	cout<<"Enter the char :";
	cin>>ch;
	int aski=int(ch);
	if((aski>=65 && aski<=90) || (aski>=97 && aski<=122)){     //A-Z=65-90  a-z=97-122
		if(aski>=65 && aski<=90 ){
			char res=char(aski+32); 
			cout<<res<<endl;
		}
		else{
			char res=char(aski-32);
			cout<<res<<endl;
		
	}}
	else{
		cout<<"pls check the input once again! put only char"<<endl;
	}
	return 0;
}
