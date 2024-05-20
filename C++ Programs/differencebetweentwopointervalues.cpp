#include<iostream>

using namespace std;

int main(){

    int A[5]{2,4,6,8,10}; 
    int *p=A;  //pointer to the first element of array A
    int *q=&A[4];    //pointer to the last element of array A

    cout<<q-p;    //difference between addresses of two pointers (elements in array)
    
    /*
        In C++, when we subtract a pointer from another pointer, it gives us an integer which is the number of elements that separate them.
        In C++, we can subtract a pointer from another pointer. The result is an integer which represents the number of elements between the two pointers.
        In C++ language, pointer arithmetic is performed on a pointer variable.
        The result of an arithmetic operation on a pointer depends on the value of that pointer and the amount by which it is increased or decreased.
        The result of an arithmetic operation on a pointer depends on the size of data type that it points to.
        The result of an addition or subtraction operation on a pointer depends on the size of data type that it points to.
    */ 
    return 0;
}
