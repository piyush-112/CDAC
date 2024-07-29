//WAP to print the date;

#include<iostream>
using namespace std;

int getdate(int year){
	return year%100;
}

int main(){
	int dd,mm,year,yy;
	cout<<"Enter the date ,month,year respecively:";
	cin>>dd>>mm>>year;
	yy=getdate(year);
		if(yy>0 && yy<=9){
			cout<<"the date is:"<<dd<<"/"<<mm<<"/"<<0<<yy;
		}
		else if(yy>=10 && yy<=99){
			cout<<"The date is:"<<dd<<"/"<<mm<<"/"<<yy;
		}
		else{
			cout<<"The date is:"<<dd<<"/"<<mm<<"/"<<year;
		}

	return 0;
}
