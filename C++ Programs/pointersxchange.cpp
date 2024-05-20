#include<iostream>

using namespace std;

int main()
{
    const int x=12;
     int *p = &x;
    cout<<*p;
    int y=23;
    *p=y;
    cout<<*p;

    return 0;
}