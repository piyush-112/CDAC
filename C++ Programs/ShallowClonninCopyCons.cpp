//ShallowClonning
/*
 This example demonstrates shallow copy in C++. Shallow copy means that when a new object is created and initialized with an existing object,
 both objects end up sharing the same memory locations for their member variables. This can lead to unintended consequences when one object 
 modifies a member variable and affects the other object unintentionally.
 */   
//copy constructor

#include<iostream>
using namespace std;
class abc{
	int no;
	public:
	abc(int no){
		this->no=no;
	}
	abc(abc &a){
		this->no=a.no;
		no=no+100;
	}
	void show(){
		cout<<no;
	}
    // Destructor to free dynamically allocated memory
//    ~abc(){
//      delete no;
//    }
};
int main(){
	int num;
	cout<<"Enter the number:";
	cin>>num;
	abc a1(num);
	abc a2(a1);
	cout<<"The number with object a2:";
	a2.show();
	cout<<"------"<<"\n";
	cout<<"The number with object a1:";
	a1.show();
	
	return 0;
}
