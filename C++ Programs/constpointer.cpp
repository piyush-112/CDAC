#include<iostream>

using namespace std;

int main()
{
    const int num = 10;
    int *ptr = &num;
    //num = 50;
    *ptr = 50;

   cout<<"num is"<<num;

   return 0;
}