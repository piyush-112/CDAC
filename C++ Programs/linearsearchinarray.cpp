#include<iostream>

using namespace std;

int main(){
    int A[10];
    int n = 10;
    int i;
    int key;

    cout<<"Enter Number"<<endl;
    for( i=0; i<n; i++){
    cin>>A[i];
    }

    cout<<"Enter Key";
    cin>>key;

    for(i=0; i<n; i++)
    {
        if(key==A[i]){
            cout<<"Found at"<<i;

            
        }
    }
    cout<<"Key is not found"<<endl;
}