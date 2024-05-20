#include<iostream>

using namespace std;

int main(){

    // int size;
    // cout<<"Enter size";
    // cin>>size; 
    
    // //creating an array of given size
    // int A[size];
    // cout<<sizeof A<<endl;

    int size;
    cout << "Enter the number of elements: ";
    cin>>size;
    int *p=new int[size];   //dynamic memory allocation using new operator
    cout<<sizeof (int[size])<<endl;

    delete  [] p;           //deleting dynamically allocated
                            //if we don't delete old memory it will be a memory leak.
    cout<<"Enter new size";
    cin>>size;
    p=new int[size];      //reallocating dynamic memory
                          //if we don't delete old memory it will be a memory leak.
    cout<<sizeof p<<endl;
return 0;
}