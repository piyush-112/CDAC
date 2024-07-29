i#include<iostream>
#include"student.h"

using namespace std;
int main(){
	int num;
	cout<<"Enter the num of stud:";
	cin >>num;
 	stud s[num];
	int ch;
	do{
	 cout<<"1.accept"<<endl;
	cout<<"2.sort by rollno"<<endl;
	cout<<"3.sort by name"<<endl;
	cout<<"4.display:"<<endl;
	cout<<"Enter your choice:";
	cin>>ch;
	switch(ch){
		case 1:
			for(int i=0;i<num;i++){
				s[i].accept();	
			}
			break;
		case 2:
			sortbymark(s,num);
			for(int i=0;i<num;i++){
                          s[i].display();
                          }

			break;
		case 3:
			sortbyname(s,num);
			for(int i=0;i<num;i++){
                          s[i].display();
                          }

			break;
		case 4:
			for(int i=0;i<num;i++){
			s[i].display();		
			}
		case 0:
			exit(0);
	}
	}
	while(ch!=0);
	return 0;	
}
