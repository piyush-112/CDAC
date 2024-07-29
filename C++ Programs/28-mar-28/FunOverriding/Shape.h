#ifndef SHAPE_H
#define SHAPE_H
#include<iostream>
using namespace std;
class Shape
{
	public:
		virtual void Accept()=0;
		virtual float CalArea()=0;
		virtual float CalPeri()=0;
};
#endif
