#include<iostream>

using namespace std;

int main(){

    int A[7]={4,8,6,9,5,2,7};
    cout<<"Array before sorting: \n";
    for(int i=0;i<7;i++)
        cout<<A[i]<<"\t";
    
    //Sorting the array using bubble sort algorithm.
    bool swapped;  
    do{ 
        swapped = false;  
        for (int i = 1; i < 7; i++){    
            if (A[i-1] > A[i]){    
                swap(A[i-1], A[i]);    
                swapped = true;    
            }       
        }            
        
    } while (swapped);    
    
    cout << "\n\nArray after sorting in ascending order:\n";
    for(int j=0;j<7;j++)
        cout<<A[j]<<"\t";
	return 0;
}