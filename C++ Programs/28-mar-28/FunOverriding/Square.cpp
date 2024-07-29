#include "Square.h"

void Square::Accept()
{
	cout<<"Enter Side : ";
	cin>>len;
}

float Square::CalArea()
{	
	float a = len * len ;
	return a;
}

float Square::CalPeri()
{	
	float p = 4 * len ;
	return p;
}


