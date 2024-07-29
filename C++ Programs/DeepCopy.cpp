//Deep copy-In which both object have its own seperate memory

#include<iostream>
using namespace std;
class abc{
	int *no;  // using pointer for dynamic memory allocation;
	public:
		abc(int num){
			no=new int(num);   //Allocating memory and copying value
		}
	//Deep copy constructor
	abc(const abc &a){    //abc class ref
		no=new int;   //Aloocating memeory
		*no=*(a.no);  //copying value
	}

	void show(){
		cout<<*no;  //Deferencing the pointer to access the value
	}
	//Destrutor
	~abc(){
		delete no;
	}
};
int main(){
	int num;
		cout<<"Enter the value of num:";
		cin>>num;
	abc a1(num);
	abc a2(a1);  //Deep copy
	cout<<"The number with object a2:";
	a2.show();
	cout<<"The number with object a1:";
        a1.show();
	return 0;
}
