#include<iostream>
using namespace std;

class Student
{
	private:
		int rollno;
		int  marks;
	public:
	Student()
	{
		rollno = 0;
		marks = 0;
	}
	
	Student(int rollno,int marks)
	{
		rollno = rollno;
		marks = marks;
	}

	friend istream& operator>>(istream& ,Student& );	
	friend ostream& operator<<(ostream& ,const Student& );
	
};

istream& operator>>(istream& is,Student& s)
{
	cout<<"Enter Rollno:";
	is>>s.rollno;
	cout<<"Enter Marks:";
	is>>s.marks;
	return is;
}


ostream& operator<<(ostream& os,const Student& s)
{
	return os<<"Roll No :"<<s.rollno<<" Marks :"<<s.marks<<endl;
}

int main()
{
	Student s1[3];

	for(int i =0;i<3;i++)
	{
		cin>>s1[i];
	}

	for(int j=0; j<3;j++)
	{
		cout<<s1[j];
	}	
	
	return 0;
}
