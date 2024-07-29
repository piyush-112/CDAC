//WAP to calculate the operation realated to the circle and ractangle

#include<iostream>
using namespace std;
	const double pi=3.14;
void areaCircum(double rad,double &areac,double &circum){
	areaic=rad*rad;
	circum=2* pi*rad;
}
void areaPeri(double l,double b,double &arear,double &peri){
	arear=l*b;
	peri=2*(l+b);
}
int main(){
	double rad,len,bre,areac,arear,peri,circum;
	int ch;
	cout<<"1.Circle"<<endl;
	cout<<"2.Ractanle:"<<endl;
	cout<<"Enter your choice:";
	cin>>ch;
	switch(ch){
		case 1:
			cout<<"Enter the radius of the circle:"<<endl;
			cin>>rad;
			areaCircum(rad,areac,circum);
			cout<<"The area of the circle:"<<areac<<endl;
			cout<<"The circum of the circle is:"<<circum<<endl;
			break;

		case 2:
			cout<<"Enter the length and breadth of the circle is:";
			cin>>len>>bre;
			areaPeri(len,bre,arear,peri);
			cout<<"The area of the ractanle:"<<areac<<endl;
			cout<<"The perimeter of the ractangle is:"<<peri<<endl;
			break;
		default:
			cout<<"Enter the wrong choice:";
	}
	return 0;
}
