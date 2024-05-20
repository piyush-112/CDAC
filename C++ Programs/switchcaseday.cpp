#include<iostream>

using namespace std;

int main(){

    int day;
    cout<<"Enter a day";
    cin>>day;

    switch(day){

        case 1:
            cout<<"It is monday";
            break;

        case 2:
            cout<<"It is tuesday";
            break;

        case 3:
            cout<<"It is wednesday";
            break;

        case  4:
            cout<<"It is thursday";
            break;

        case 5:
            cout<<"It is friday";
            break;

        case 6:
            cout<<"It is saturday";
            break;

        case 7:
            cout<<"It is sunday";
            break;

        default:
            cout<<"Invalid day";


    }

}