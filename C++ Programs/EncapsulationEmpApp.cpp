//WAP to demostrate the Encapulation 
//Emp,Manager ,guard


#include<iostream>
#include<cstring>
using namespace std;
class Emp{
	private:
		int id;
		string name;
		double sal;
	public:
		void getData(){
			cout<<"Enter the id of the empployee:";
			cin>>id;
			cout<<"Enter the name of the employee:";
			cin>>name;
			cout<<"Enter the salary of the emplyee:";
			cin>>sal;
		}
		void showDetails(string type){
			if(type=="Guard"){
				cout<<"The name of the emp:"<<name<<"\n"<<"The id of the emp:"<<id<<"\n";
			}
			else if(type=="Manager"){
				cout<<"The nameof the emp:"<<name<<"with salary"<<sal<<"\n";
			}
			else{
				cout<<"Inappropriate type choosed"<<"\n";
			}
		}
};
int main(){
	Emp e;
	e.getData();
	int ch;
	cout<<"Option:"<<"\n"<<"1.Guard"<<"\n"<<"2.Manager"<<"\n";
	cout<<"Enter Your choice:";
	cin>>ch;
	switch(ch){
		case 1:
			e.showDetails("Guard");
			break;
		case 2:
			e.showDetails("Manager");
			break;

		default:
			cout<<"Invalid choice";
	}
	return 0;
}
