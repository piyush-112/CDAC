//WAP to do a modular code for integer array
//1.Function for accept aarray element]
//2.Function for sorting array element
//3.function for printing the array element

#include<iostream>
using namespace std;
 //1
 void accept(int *arr,int size){
	for(int i=0;i<size;i++){
		cout<<"Enter the elemetn into the array:";
		cin>>arr[i];
	}
 }

//2
void sort(int *arr,int size){
	for(int  i=0;i<size;i++){
		for(int j=i+1;j<size;j++){
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
/*	for(int i=0;i<size;i++){
		cout<<arr[i]<<"\t";
	}*/

	
}

//3
void display(int *arr,int size){
	for(int i=0;i<size;i++){
		cout<<arr[i]<<"\t";
	}
}
int main(){
	int size;
	int arr[size];
	cout<<"Enter the size of the array:";
	cin>>size;
	accept(arr,size);
	sort(arr,size);
	display(arr,size);
	return 0;
}
