#include<iostream>

using namespace std;

 int add(int x, int y){

    int z;
    z=x+y;

    return z;
 }

 int main(){

    int a=10;
    int b=20;
    int c;

    c=add(a,b);

    cout<<"Sum is"<<c;

    return 0;
    
 }