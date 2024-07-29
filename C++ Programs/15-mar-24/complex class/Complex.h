//complex number header 
#include<iostream>
using namespace std;
class Complex
{
	private:
		int i;
		int j;

	public:
		Complex(int i=0,int j=0);
		void Accept();
		void Display()const;
		void Display1()const;
        	int GetValueI()const;
		void SetValueI(int);
		Complex operator+(const Complex& c2) const;
		Complex operator-(const Complex& c2) const;
};

