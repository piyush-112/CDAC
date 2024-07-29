// Write a cpp program for operator overloading

#include<iostream>
using namespace std;
class student{
	int Sanskrit;
	int Marathi;
	public:
		student(int Sanskrit,int Marathi){
			this->Sanskrit=Sanskrit;
			this->Marathi=Marathi;
		}
		void operator=(const student& s){
			Sanskrit=s.Sanskrit;
			Marathi=s.Marathi;
		}
		void marks(){
			cout<<"The marks of Sanskrit:"<<Sanskrit <<endl <<"The marks of Marathi:"<<Marathi<<endl;
		}
};
int main(){	
	int S,M;
	cout<<"Enter the marks of Sanskrit and Marathi:"<<endl;
	cin>>S>>M;
	student std1(S,M);
	std1.marks();
	int S1,M1;
	cout<<"Enter the 2nd Student marks:" <<endl;
	cin>>S1>>M1;
	student std2(S1,M1);
	std2.marks();
	std1 = std2; 
 	cout << endl; 
        cout << "Student 1 marks : "; 
        std1.marks(); 
        cout << "Student 2 marks : "; 
        std2.marks(); 
	return 0;
}
