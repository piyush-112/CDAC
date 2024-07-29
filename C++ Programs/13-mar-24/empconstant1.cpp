//Write a cpp program to check the const condtion with using pointer
//case 1.  const invoking object---const mem fun ==Legal
//case 2.  const invoking object---non-const mem fun ==ILLegal
//case 3. non-const invoking object---const mem fun ==Legal
//case 4. non-const im="";
		
//case 1.  const invoking object---const mem fun ==Legal

#include<iostream>
#include<string>
class emp{
	int id;
	string nm;
	public:
		void * accept() const {
			cout<<"Enter the id and name of the employee:"<<endl;
			cin>>id;
			cin.get();
			getline(cin,nm);
		}
		void display() const {
			cout<<"The id of the employee is:"<<id<<endl<<"The Employee name:"<<nm<<endl;
		}
/*
//case 2.  const invoking object---non-const mem fun ==ILLegal
                 * void accept() const {
                          cout<<"Enter the id and name of the employee:"<<endl;
                          cin>>id;
                          cin.get();
                          getline(cin,nm);
                  }
                  void display(){
                          cout<<"The id of the employee is:"<<id<<endl<<"The Employee name:"<<nm<<endl;
                  }

//case 3. non-const invoking object---const mem fun ==Legal
                  void accept(){
                          cout<<"Enter the id and name of the employee:"<<endl;
                          cin>>id;
                          cin.get();
                          getline(cin,nm);
                  }
                  void display() const{
                          cout<<"The id of the employee is:"<<id<<endl<<"The Employee name:"<<nm<<endl;
                  }

//case 4. non-const invoking object---non-const mem fun ==Legal
       	          void accept(){
                          cout<<"Enter the id and name of the employee:"<<endl;
                          cin>>id;
                          cin.get();
                          getline(cin,nm);
                  }
                  void display(){
                          cout<<"The id of the employee is:"<<id<<endl<<"The Employee name:"<<nm<<endl;
                  }
*/
};
int main(){
	
	const emp e;
	e.accept();
	e.display();
	return 0;
}

