//Accept n numbers from users and store them in to array, Write a function to sort and display sorted array.

#include<iostream>
using namespace std;

void sort(int arr[],n)
{
//	int size=sizeof(arr[])/sizeof(arr[0]);
	int temp;
	for(int i=0; i<n-1; i++)
	{
		for(int j=0; j<n-i-1; j++)
		{
			if(arr[j]<arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}	
		}
	}
	cout<<"The sorted array is:"<<endl;
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}

}
int main()
{
	int size;
	cout<<"Enter the size of array:";
	cin>>size;
	int arr[size];

	cout<<"Enter the elements of the array"<<endl;
	for(int i=0;i<size;i++)
	{
		cin>>arr[i];
	}
	sort(arr,size);
	return 0;
}
