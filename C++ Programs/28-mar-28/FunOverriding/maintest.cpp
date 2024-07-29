#include "Square.h"
#include "Square.cpp"
int main()
{
	
        Shape *sp = NULL;
        Square s;
        sp=&s;
        sp->Accept();
        
        float a=sp->CalArea();
        float b=sp->CalPeri();
	
    	cout<<"\n Area of Square is ="<<a;
   	cout<<"\n Perimeter of Square is ="<<b;
   	
   	return 0;
    
}
