//File in which we define the function

#include "stud1.h"
using namespace std;

void stud::Accept()
{
	cout<<"Enter the id:"<<endl;
	cin>>id;
	cout<<"Enter the name:";
	cin>>name;
	cout<<"Enter the age:";
	cin>>age;
	try {
  		if (age >= 18) {
   			 cout << "Access granted - you are old enough."<<endl;
  			} else {
    				throw 505;
 			 }	
             }   
        catch (int myNum) {
  		cout << "Access denied - You must be at least 18 years old.\n";
  		cout << "Error number: " << myNum<<endl;
} 
}
void stud :: Display(){
	cout<<"Id:"<<id<<" "<<"Name:"<<name<<" "<<"Age:"<<age<<endl;
}
