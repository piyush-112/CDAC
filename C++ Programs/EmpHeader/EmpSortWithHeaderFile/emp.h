//These id the header file where we declare a member function of emp class

#ifndef EMP_H
#define EMP_H
#include<string>
using namespace std;
class emp
{
	private:
		int id;
		string name;
		double sal;
		static int count;
	public:
		emp();
		emp(int id, string name, double sal);
		int getsal();
		void accept();
		void display() const;
		static void printCount();
		~emp();

};
#endif

