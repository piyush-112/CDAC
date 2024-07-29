//WAp create an array class to implement constructor destructor and data setter function

#include<iostream>
#include<string>
using namespace std;
class emp{
	int id;
	string nm;
	public:
	emp(int id,string nm){
			this->id=id;
			this->nm=nm;
	}
/*	
	void getinfo(){
		cout<<"Enter the id of the emp:";
		cin>>id;
		cout<<"Enter the name :";
		cin.get();
		getline(cin,nm);
	}
*/
	void setinfo(){
		cout<<"The id of the employee:"<<id<<endl;
		cout<<"The name of the employe:"<<nm<<endl;
	}
	~emp(){
		cout<<"DTOR called"<<endl;
	}
};
int main(){
	/*
	int i;
	string name;
	cout<<"Enter the id and name of the employee:";
	cin>>i;
	cin.get();
	getline(cin,name);
	*/
	emp e(55,"Ravan");
//	e.getinfo();
	e.setinfo();
	return 0;
}
