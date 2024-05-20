#include<iostream>
#include<string>

using namespace std;

class employee{

        private:
                int id;
                string name;
                int sal;
                static int count;
        public:
                employee()
                {
                    id=0;
                    name=" ";
                    sal=0;
                    count++;
                    cout<<"CTOR called"<<endl;
                }

                employee(int eid, string ename, int esal)
                {
                    id=eid;
                    ename=name;
                    sal=esal;
                    count++;
                    cout<<"Parameterized CTOR called"<<endl;
                }
                
};

int employee::count=0;

int main()
{
  employee e1(10, "pc", 30000);
  employee e2(20, "piyush", 10000);
  employee e3;
  employee e4;
  cout<<"count is:"<<count;
  return 0;
}