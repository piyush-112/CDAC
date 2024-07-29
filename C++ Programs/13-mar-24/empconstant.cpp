#include<iostream>
#include<string>

using namespace std;

class employee{

	private:
		int id;
		string name;

	public:
		employee()
		{
			id=0;
			name="";
		}
                //1 Invoker is constant, mb is cost = legal
		/* void accept() const  
		{
			cout<<"Enter id:"<<id<<endl;
 			cin>>id;
			cout<<"Enter name:"<<name<<endl;
			cin.get();
			getline(cin, name);
		}

		void display() const 
		{
			cout<<"Id is:"<<id<<endl;
			cout<<"Name is:"<<name<<endl;
		} */

		//2 Invoker is constant, mb is not cost = illegal
                /* void accept() const
                {
                        cout<<"Enter id:"<<id<<endl;
                        cin>>id;
                        cout<<"Enter name:"<<name<<endl;
                        cin.get();
                        getline(cin, name);
                }

                void display() const
                {
                        cout<<"Id is:"<<id<<endl;
                        cout<<"Name is:"<<name<<endl;
                }

		*/

	//3 Invoker is non constant, mb is const = legal
                 /* void accept()
                {
                        cout<<"Enter id:"<<id<<endl;
                        cin>>id;
                        cout<<"Enter name:"<<name<<endl;
                        cin.get();
                        getline(cin, name);
                }

                void display() const
                {
                        cout<<"Id is:"<<id<<endl;
                        cout<<"Name is:"<<name<<endl;
                } */

	//4 Invoker is non constant, mb is non cost = legal
                 void accept()
                {
                        cout<<"Enter id:"<<id<<endl;
                        cin>>id;
                        cout<<"Enter name:"<<name<<endl;
                        cin.get();
                        getline(cin, name);
                }

                void display()
                {
                        cout<<"Id is:"<<id<<endl;
                        cout<<"Name is:"<<name<<endl;
                } 

};

int main()
{	
	
	/* 1
	 const employee emp;
	emp.accept();
	emp.display();
	return 0; */

	/* 2 
         const employee emp;
        emp.accept();
        emp.display();
        return 0; */

	/* 3
        employee emp;
        emp.accept();
        emp.display();
        return 0; */	
        
	//4
        employee emp;
        emp.accept();
        emp.display();
        return 0; 

}

