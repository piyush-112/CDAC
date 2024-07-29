//Pointer with Object: To Allocate the memory at run time

#include<iostream>
#include<cstring>
using namespace std;
class Emp{
	int id;
	string nm;
	public:
		void getdata(){
			cout<<"Enter the id of the emp:";
			cin>>id;
			cout<<"Enter the name of the emp:";
			cin.get();
			getline(cin,nm);
		}
		void showdata(){
			cout<<"Id of the emp:"<<id<<"\t"<<"Name is:"<<nm;
		}
};
int main(){
	int num;
	cout<<"Enter the number of emp:";
	cin>>num;
	Emp *e=new Emp[num];
	for(int i=0;i<num;i++){
		e[i].getdata();
	}
	for(int i=0;i<num;i++){
                e[i].showdata();
        }


	return 0;
}
