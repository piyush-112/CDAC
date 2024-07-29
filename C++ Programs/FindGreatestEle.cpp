//wrie a cpp program to greatest element from entered element

#include<iostream>
using namespace std;
int main(){
	int n1,n2,n3;
	cout<<"Enter the three number:";
	cin>>n1>>n2>>n3;
	int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
	cout<<"The maximum number from three number is:"<<max<<"\n";
	return 0;
}
