#include<iostream>

using namespace std;

class Rectangle{

    public:

    int l;
    int b;

    int area(){
        return l*b;
    }

};

int main(){

    Rectangle r1;
    r1.l=12;
    r1.b=12;
    cout<<"Area of rectangle is"<<r1.area()<<endl;
    return 0;
}
    
//     void get_details() {
//         cout << "Enter length of rectangle : ";
//         cin >> l;
//         cout << "Enter breadth of rectangle : ";
//         cin >> b;
//     }

//     float area() {  
//         return (l * b);  
//     } 
// };

// int main(){
//     Rectangle r1,r2;
//     r1.get_details();
//     cout<<"Area of first rectangle is : "<<r1.area()<<endl;
//     r2.get_details();
//     cout<<"\nArea of second rectangle is : "<<r2.area()<<endl;
