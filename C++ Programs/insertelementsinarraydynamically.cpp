#include<iostream>

using namespace std;

int main(){
    
    int size;
    cout << "Enter the number of elements: ";
    cin>>size;
    int *p=new int[size];   //dynamic memory allocation using new operator
    for(int i =0 ;i < size ;i++) {
        cout << "Element [" << i+1 << "]: ";
        cin >> *(p + i);      //inputting element one by one in dynamic memory
    }

    cout << endl << "Elements are : \n";
    for (int j = 0;j < size;j++ ) {
        cout << *(p + j) << "\t";       //accessing each element using pointer arithmetic
    }
    delete[] p;                //deleting dynamically allocated memory using delete [] operator
return 0;
}