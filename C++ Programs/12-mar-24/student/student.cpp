#include<iostream>
#include<string>
#include"student.h"

using namespace std;

void stud::accept(){
	cout<<"Enter the rollno:";
	cin>>rollno;
	cout<<"Enter the name:";
	cin.get();
	getline(cin,name);
	cout<<"Enter the marks:";
	cin>>marks;
}

void stud::display(){
	cout<<rollno<<" "<<name<<" "<<marks<<endl;
cout<<"hello ";
}
int stud::getmarks(){
	return marks;
}
string stud::getname(){
	return name;
}

void sortbymark(stud arr[],int n ){
	 for(int i=0;i<n-1;i++){
                  for(int j=i+1;j<n;j++){
                          if(arr[i].getmarks()>arr[j].getmarks()){
                          stud temp;
                          temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                         }
                 }
          }
}
 void sortbyname(stud arr[],int n){
 for(int i=0;i<n-1;i++){
                  for(int j=i+1;j<n;j++){
                          if(arr[i].getname()>arr[j].getname()){
                          stud temp;
                         temp=arr[i];
                          arr[i]=arr[j];
                          arr[j]=temp;
                          }
                  }
          }

}
 


