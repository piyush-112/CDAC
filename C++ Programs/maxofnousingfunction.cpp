#include<iostream>

using namespace std;

int maxim(int a, int b , int c){

    if(a>b && a>c)
    return a;
    else if (b>c)
    return b;
    else return c;
}

int main(){

    int x=12;
    int y=13;
    int z=14;
    int r;

    r=maxim(x,y,z);
    cout<<"Maximum no. is"<<r<<endl;
    // cout<<"Maximum of "<<x<<","<<y<<" and "<<z<<" is : "<<maxim(x,y,z);
    
    return 0;
}
