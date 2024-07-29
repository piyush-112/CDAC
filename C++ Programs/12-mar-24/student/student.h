#include<iostream>
#include<string>
using namespace std;

class stud
{
	int rollno;
	string name;
	int marks;
public:
	void accept();
	void display();
	int getmarks();
	string getname();
};
void sortbymark(stud *,int );
void sortbyname(stud *,int );

