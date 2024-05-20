#include <iostream>
#include <string>

using namespace std;

class Product {
public:
    string name;
    double price;
};

class Customer {
public:
    string name;
    Product purchasedProducts[10]; // Assuming a customer can purchase up to 10 products
    int numPurchased;

    Customer() : numPurchased(0) {}
};

class SpectacularMart {
public:
    Product products[10]; // Assuming up to 10 products in the store
    int numProducts;
    Customer customers[10]; // Assuming up to 10 customers
    int numCustomers;

    SpectacularMart() : numProducts(0), numCustomers(0) {}

    void addProduct(string name, double price) {
        if (numProducts < 10) {
            products[numProducts].name = name;
            products[numProducts].price = price;
            numProducts++;
            cout << "New product " << name << " added." << endl;
        } else {
            cout << "Cannot add more products. Store full." << endl;
        }
    }

    void addCustomer(string name) {
        if (numCustomers < 10) {
            customers[numCustomers].name = name;
            numCustomers++;
            cout << "New customer " << name << " added." << endl;
        } else {
            cout << "Cannot add more customers. Store full." << endl;
        }
    }

    void displayProducts() {
        cout << "Available Products:" << endl;
        for (int i = 0; i < numProducts; i++) {
            cout << "Name: " << products[i].name << ", Price: " << products[i].price << endl;
        }
    }

    void newCustomer() {
        string name;
        cout << "Enter customer name: ";
        getline(cin, name);
        addCustomer(name);
    }

    void newProduct() {
        string name;
        double price;
        cout << "Enter product name: ";
        getline(cin, name);
        cout << "Enter product price: ";
        cin >> price;
        cin.ignore(); // Ignore the newline character
        addProduct(name, price);
    }

    void customerPurchase() {
        string customerName;
        cout << "Enter customer name: ";
        getline(cin, customerName);
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i].name == customerName) {
                cout << "Customer: " << customers[i].name << endl;
                displayProducts();
                string productName;
                cout << "Enter product name to purchase: ";
                getline(cin, productName);
                for (int j = 0; j < numProducts; j++) {
                    if (products[j].name == productName) {
                        customers[i].purchasedProducts[customers[i].numPurchased] = products[j];
                        customers[i].numPurchased++;
                        cout << productName << " purchased by " << customers[i].name << "." << endl;
                        return;
                    }
                }
                cout << "Invalid product name." << endl;
                return;
            }
        }
        cout << "Customer not found." << endl;
    }

    void displayCustomerPurchases() {
        string customerName;
        cout << "Enter customer name: ";
        getline(cin, customerName);
        for (int i = 0; i < numCustomers; i++) {
            if (customers[i].name == customerName) {
                cout << "Customer: " << customers[i].name << endl;
                if (customers[i].numPurchased == 0) {
                    cout << "No purchases made." << endl;
                } else {
                    cout << "Purchased Products:" << endl;
                    for (int j = 0; j < customers[i].numPurchased; j++) {
                        cout << "Name: " << customers[i].purchasedProducts[j].name << ", Price: " << customers[i].purchasedProducts[j].price << endl;
                    }
                }
                return;
            }
        }
        cout << "Customer not found." << endl;
    }
};

int main() {
    SpectacularMart mart;

    // Add some products
    mart.addProduct("Laptop", 50000.0);
    mart.addProduct("Camera", 25000.0);
    mart.addProduct("Watch", 4400.0);

    // Add some customers
    mart.addCustomer("John Doe");
    mart.addCustomer("Jane Smith");

    while (true) {
        cout << "\nSpectacular Mart Menu:" << endl;
        cout << "1. Display all products" << endl;
        cout << "2. New Customer" << endl;
        cout << "3. New Product" << endl;
        cout << "4. Customer purchase" << endl;
        cout << "5. Display customer purchases" << endl;
        cout << "6. Exit" << endl;

        string choice;
        cout << "Enter your choice (1-6): ";
        getline(cin, choice);

        switch (stoi(choice)) {
        case 1:
            mart.displayProducts();
            break;
        case 2:
            mart.newCustomer();
            break;
        case 3:
            mart.newProduct();
            break;
        case 4:
            mart.customerPurchase();
            break;
        case 5:
            mart.displayCustomerPurchases();
            break;
        case 6:
            cout << "Exiting..." << endl;
            return 0;
        default:
            cout << "Invalid choice. Please try again." << endl;
            break;
        }
    }

    return 0;
}
