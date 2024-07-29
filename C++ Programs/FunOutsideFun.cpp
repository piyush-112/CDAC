//Define the function outside the function
//for that purpose we use the Scope rosolution operator ::

#include<iostream>
using namespace std;
class Add{
	private :
		int x;
		int y;
	public:
		void setVal(int x,int y);
		void GetVal();
};
void Add::setVal(int x,int y){
	this->x=x;
	this->y=y;
}
void Add::GetVal(){
	cout<<"The sum of the two number is:"<<x+y<<"\n";
}
int main(){
	int a,b;
	cout<<"Enter the value of the a and b:";
	cin>>a>>b;
	Add d;
	d.setVal(a,b);
	d.GetVal();
	return 0;
}
