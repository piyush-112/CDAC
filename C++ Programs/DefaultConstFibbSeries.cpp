//To demostrate the the default constructor example
// WAP to print the fibonacci Series using  the default constrctor

#include<iostream>
using namespace std;
class fibo{
	int f1,f2,fib,i;
	public:
		fibo(){      //Default Constructor
			f1=0;
			f2=1;
		}
		void showfibo(){
			fib=f1+f2;
			f1=f2;
			f2=fib;
			cout<<fib<<"\t";
		}
	

};
int main(){
	int num;
	fibo f;    //Create the object of the class fibo
	cout<<"Enter the range upto you which you want to print the fibonacci Series:";     //Accept the range upto you which the print the fibonacci series;
	cin>>num;
	for(int i=0;i<num;i++){
		f.showfibo();
	}
	return 0;
}
