//WAP  To do aa constructor overloading in Emp class

#include<iostream>
#include<string>
using namespace std;
class emp{
	int id;
	string nm;	
	public:
		emp(){
			nm="Ram";
			id=99;
		}
		emp(string nm){
			this->nm=nm;
			id=0;
		}
		emp(int id,string nm){
			this->id=id;
			this->nm=nm;
		}
		void display(){
			cout<<"The id of the employee is:"<<id<<endl;
			cout<<"The name of the employee is:"<<nm<<endl;
		}
};
int main(){
	emp e1;     //Default Constructor
	emp e2("Lakshaman");   //Parameterised constructor with only passing name not id
	emp e3(88,"Bharat");   //Parameterised constructor with passing both is id and name
	
	cout<<"Employee 1"<<endl;
	e1.display();            
	cout<<"--------------------"<<endl;
	cout<<"Employee 2"<<endl;
	e2.display();
	cout<<"--------------------"<<endl;
	cout<<"Employee 3"<<endl;
	e3.display();

	return 0;
}
