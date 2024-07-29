//WAP to add the element into the array and display it;

#include<iostream>
using namespace std;
int main(){
	int num;
	cout<<"Enter the number:";
	cin>>num;
	//int *arr=new int[num];     //Dynamic Array Allocation..................................................................................
	int arr[num];
	cout<<"Enter the element into the array:";
	for(int i=0;i<num;i++){
		cin>>arr[i];
	}
	for(int i=0;i<num;i++){
		cout<<arr[i]<<"\n";
	}
//	delete []arr;
	return 0;
}
