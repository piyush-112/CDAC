#include<iostream>
using namespace std;

int main()
{
    int savings;
    cin>>savings;

    if(savings>5000){
        if(savings>10000){
            cout<<"Go on a Road trip";
        }
        else{
            cout<<"go for a local trip";
        }
        }
    
    else if(savings>2000){
                cout<<"Go with Akanksha";
    }
    
    else {
        cout<<"Go with Soniya";
    }

    return 0;
}
