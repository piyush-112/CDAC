//Demostrate the program related to overloaded constructor
//WAP to calculate the Area of the Square(float,int);

#include<iostream>
using namespace std;
class square{
	public:
		square(int len1){     //Constr for calulating the area pasing the int 
			cout<<"The area of the sqaure(int) is:"<<len1*len1<<"\n";
		  
		}
		square(float len2){      //constr with passing float value
			cout<<"The area of the square(float) is:"<<len2*len2<<"\n";
		}
};
int main(){
	square s(2);   //pass int value
	square s1(2.2f);  //pass float value
	return 0;
}
