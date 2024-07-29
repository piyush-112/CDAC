//WAP to print all combination that are possible from 1,2,3;

#include<iostream>
using namespace std;

int main(){
	int i=1;
	int j;
	int k;
//	cout<<"Enter the value of i,j,k:";
//	cin>>m>>n>>o;
	for(int i=1; i<=3; i++){
		for(int j=1; j<=3; j++)
		{
			for(k=1; k<=3; k++)
	//		if(i!=j && j!=k && k!=i){
		
			cout<<i<<j<<k<<endl;
				
	//		}
		}
	
	}
	return 0;


	/*
	int val;
	int size;
	int i;
	cout<<"Enterthe size of the array:";
	cin>>size;
	int arr[size];
	for( i=0;i<size;i++){
	
		cout<<"Enter the value";
		cin>>arr[i];

	}
	for(i=0;i<size;i++){
		cout<<arr[i]<<"\t";
	}
	return 0;
	*/
}
