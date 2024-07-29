//Write a cpp program to demostreate the ARRAY OF OBJECT concept in cpp
//Take A data id and name of the five customer  and  dispaly it using the array of object

#include<iostream>
#include<cstring>
using namespace std;
class Emp{
	private:
		int id;
		string name;
	public:
		void Setdata(){
			cout<<"Enter the id and the name of the empolyee:";
			cin>>id>>name;
		}
		void Getdata(){
			cout<<"Id of the employee is:"<<id<<"\t"<<"with name:"<<name<<"\n";
		}
};
int main(){
	int num;
	cout<<"Enter the number of the employee in your organisation:"<<"\n";
	cin>>num;
	Emp e[num];
	cout<<"Enter the data of the Employee:";
	for(int i=0;i<num;i++){
			e[i].Setdata();
			}
	cout<<"Display The details:"<<"\n";
	for(int i=0;i<num;i++){
		e[i].Getdata();
	}
	return 0;
}
