#include<iostream>

using namespace std;

int main(){

    int *p=new int[5];
    p[0]=12;
    p[1]=13;
    
    cout<<p[1]<<endl;
    delete []p; //deleting the dynamically allocated memory 
    cout<<p[1]<<endl; //accessing deleted memory, undefined behaviour (will print the garbage value)
    p=nullptr;
    return 0;
}