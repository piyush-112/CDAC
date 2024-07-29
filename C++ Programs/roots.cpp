#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	float a,b,c,D,x1,x2;
	cout<<"Enter coefficients a, b and c"<<endl;
	cin>>a>>b>>c;
	D=b*b-4*a*c;
	cout<<"Determinant = "<<D<<endl;
	x1=(-b+sqrt(D))/(2*a);
	x2=(-b-sqrt(D))/(2*a);
	cout<<"Roots are "<<x1<<" and "<<x2<<endl;
	return 0;
}
