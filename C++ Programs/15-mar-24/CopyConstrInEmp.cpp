//WAP to  implement the copy constructor in emp class

#include<iostream>
#include<string>
using namespace std;
class emp{
	int id ;
	string nm;
	public:
		emp(){
			id=01;
			nm="Balrama";
		}
		emp(int id,string nm){
			this->id=id;
			this->nm=nm;
		}
		
		//copy constructor
		emp(const emp &ecopy){ 
			id=ecopy.id;
			nm=ecopy.nm;
		}
		void display(){
			cout<<"The id of the employee is :"<<id<<endl;
			cout<<"The name of the employee is :"<<nm<<endl;
		}
};
int main(){
	int i;
	string name;
	emp e1;               //calling default constr
	e1.display();
	cout<<"--------------------"<<endl;
	cout<<"Enter the id of the emp:"<<endl;
	cin>>i;
	cout<<"Enter the name of the emp:"<<endl;
	cin.get();
	getline(cin,name);
	emp e2(i,name);        //Take the i/p from user and pass to the para constructor
	emp e3=e2;             //create the object using copy constructor
	e3.display();
	return 0;
}
