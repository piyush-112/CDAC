#include "calculator.h"
#include <iostream>
using namespace std;

int main()
{
	double n1, n2;
	double result;
	int choice;
	char ch;
	double res;
	do{
		cout<<"Enter values of n1 and n2"<<endl;
		cin>>n1>>n2;
		cout<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Product"<<endl<<"4.Division"<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1: 
				res=add(n1,n2);
				cout<<"Result="<<res<<endl;
				break;
			case 2:
				res=subtraction(n1,n2);
				cout<<"Result="<<res<<endl;
				break;
			case 3:
				res=multiplication(n1,n2);
				cout<<"Result="<<res<<endl;
				break;
			case 4:
				res=division(n1,n2);
				cout<<"Result="<<res<<endl;
				break;
		}
		cout<<"Do you want to continue?(y/n):";
		cin>>ch;

	}while(ch=='y');

	return 0;
}
