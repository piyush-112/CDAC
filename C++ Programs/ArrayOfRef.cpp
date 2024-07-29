//Write a cpp program for demostrating the array of ref
//create a simple multiplication program to demostrate the array of ref

#include<iostream>
using namespace std;
class mul{
	private:
		int a;
		int b;
	public:
		void setData(int a,int b){
			this->a=a;
			this->b=b;
		}
		void showmul(){
			cout<<"The multiplication of the teo number is:"<<a*b<<"\n";
		}
};
int main(){
	int x,y;
	cout<<"Enter the data value of the a,b:";
	cin>>x>>y;
	mul *a=new mul();
	a->setData(x,y);
	a->showmul();
	return 0;
}
