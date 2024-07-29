//here we write a main function and call the delared function in the main function

#include"Complex.h"
int main()
{

	Complex c1(10,10),c2(20,20),c3, c4(60, 60),c5;
	c3 = c1 + c2;
	cout<<"\n value after addition"<<endl;
	c3.Display();
	
	//c5 = c4 - c2;
	c5 = c2 - c4;
	cout<<"\n value after addition"<<endl;
	c5.Display1();
	 return 0;
}

