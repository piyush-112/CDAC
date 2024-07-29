//WAP for matchsticks game

#include<iostream>
using namespace std;
int main(){
	int m=21;
	int p;
	while(1){
	cout<<"Enter the no that you gone p:(1,2,3,4)";
	cin>>p;

			m=m-p;
			cout<<m<<endl;
			int c=5-p;
			cout<<"computer choose:"<<c<<endl;
			m=m-c;
		
		if(m==1){
			cout<<"remining:"<<m<<endl;
			cout<<"You lost"<<endl;
		break;
		}
	}
	
	
	return 0;
}
