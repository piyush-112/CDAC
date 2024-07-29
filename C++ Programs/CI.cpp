//WAP to calculate Compound Interest
// A = P (1 + R/100)^T
// CI = A - p
#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	double P,R,T,A,CI;
	cout<<"Enter Principal= ";
	cin>>P;
	cout<<"Enter Rate= ";
	cin>>R;
	cout<<"Enter Time= ";
	cin>>T;

	A = pow (P * (1 + R/100), T);
	CI = A - P;
	cout<<"Compound Interest= "<<CI<<endl;
	return 0;
}
