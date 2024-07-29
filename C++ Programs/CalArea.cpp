// Write functions for calculating area of circle, rectangle, and square and call these functions from main function.
#include<iostream>
using namespace std;

void circle(float rad)
{
	cout<<"Area="<<3.14*rad*rad<<endl;

}

void rectangle(float l, float b)
{
	cout<<"Area="<<l*b<<endl;
}

void square(float side)
{
	cout<<"Area="<<side*side<<endl;
}

int main()
{
	float rad, l, b, side;
	cout<<"Enter radius of circle=";
	cin>>rad;
	circle(rad);
	cout<<"Enter length and breadth of rectangle"<<endl;
	cin>>l>>b;
	rectangle(l,b);
	cout<<"Enter side of square=";
	cin>>side;
	square(side);
	return 0;
}
