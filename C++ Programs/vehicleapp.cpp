#include<iostream>
using namespace std;

class vehicle {
public:
    string type;
    double cost;
    double prem = 0; // Initialize prem to 0

    void setdata() {
        cout << "Enter the vehicle type: ";
        cin >> type;
        cout << "Enter the cost of the vehicle: ";
        cin >> cost;
    }

    virtual double premium() = 0;

    virtual void getdata() = 0;
};

class bike : public vehicle {
public:
    double premium() {
        prem = (cost) * (1.0 / 100); // Use floating-point division
        return prem;
    }

    void getdata() {
        double bike_prem = prem;
        cout << "Vehicle type: " << type << ". Premium @ 1% = " << bike_prem << endl;
        cout << endl;
    }
};

class Car : public vehicle {
public:
    double premium() {
        prem = (cost) * (3.0 / 100); // Use floating-point division
        return prem;
    }

    void getdata() {
        double car_prem = prem;
        cout << "Vehicle type: " << type << ". Premium @ 3% = " << car_prem << endl;
        cout << endl;
    }
};

class Truck : public vehicle {
public:
    double premium() {
        prem = (cost) * (3.0 / 100); // Use floating-point division
        return prem;
    }

    void getdata() {
        double T_prem = prem;
        cout << "Vehicle type: " << type << ". Premium @ 3% = " << T_prem << endl;
        cout << endl;
    }
};

int main() {
    int ch, choice;
    vehicle *v;

    do {
        cout << "Choice:\n" << endl;
        cout << "1.Bike\n" << endl;
        cout << "2.Car\n" << endl;
        cout << "3.Truck\n" << endl;
        cout << "Enter your choice: ";
        cin >> ch;

        switch (ch) {
            case 1:
                v = new bike;
                v->setdata();
                v->premium(); // Calculate premium
                v->getdata();
                delete v; // Delete dynamically allocated object
                break;

            case 2:
                v = new Car;
                v->setdata();
                v->premium(); // Calculate premium
                v->getdata();
                delete v; // Delete dynamically allocated object
                break;

            case 3:
                v = new Truck;
                v->setdata();
                v->premium(); // Calculate premium
                v->getdata();
                delete v; // Delete dynamically allocated object
                break;

            default:
                cout << "Invalid choice" << endl;
        }

        cout << "Do you want to Continue (1/0): ";
        cin >> choice;
    } while (choice == 1);

    return 0;
}