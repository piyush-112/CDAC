//WAp to print fabbonacci series
//0 1 2 3 5 8...

#include<iostream>
using namespace std;

int main(){
	int fir=0;
	int sec=1;
	int thi;
	int limit;
	cout<<"Enter the limit:"<<endl;
	cin>>limit;
	for(int i=0;i<limit;i++){
		thi=fir+sec;
		cout<<thi<<endl;
		fir=sec;
		sec=thi;
	}
	return 0;
}
