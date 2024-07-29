//WAP to create the class for addition of two number:

#include<iostream>
using namespace std;
class Addition{
	private:
		int a;
		int b;
	public:
		void setdata(int a,int b){
			this->a=a;
			this->b=b;
		}
		int getAdd(){
			return a+b;
		}
	};
int main(){
	int n1,n2;
	cout<<"Enter the value of the number 1:";
	cin>>n1;
	cout<<"Enter the value of the number 2:";
	cin>>n2;
	Addition a;
	a.setdata(n1,n2);
	int result=a.getAdd();
	cout<<"The addtion result is:"<<result<<"\n";
	return 0;
}
