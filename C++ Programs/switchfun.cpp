
//WAP to to do a simple calulator using switch case;
//+ - * / 

#include<iostream>
using namespace std;

double sum(double a,double b){
	double add=a+b;
	return add;
}

double subtract(double a, double b){
	double sub;  
	if(a<b){
		return 0;
	}
	else{
		sub=a-b;
		return sub;
	}
}

double product(double a, double b){
	double pro=a*b;
	return pro;
}

double division(double a,double b){
	double div=0;
	if(b==0){
		cout<<"Please enter a right input val of b";
	}
	else{
	div=a/b;
	}
	return div;
}

int main(){
	double n1;
	double n2;
	double res;
	int ch;
	char choice;
	do{
        cout<<"Enter the value of n1:";
	cin>>n1;
	cout<<"Enter the value of n2:";
	cin>>n2;
	cout<<"1.SUM"<<endl;
	cout<<"2.SUBTRACTION"<<endl;
	cout<<"3.MULTIPLICATION"<<endl;
	cout<<"4.DIVISION"<<endl;
	cout<<"Enter Your Choice:";
	cin>>ch;
	switch(ch){
		case 1:
			res=sum(n1,n2);
			cout<<"The sum of the two number is:"<<res<<endl;
			break;
		case 2:
			res=subtract(n1,n2);
			if(res==0){
				cout<<"please enter right value of a"<<endl;
			}
			else{
			cout<<"The Subtraction of two number:"<<res<<endl;
			}
			break;
		case 3:
			res=product(n1,n2);
			cout<<"THe Multiplication of the two number is :"<<res<<endl;
			break;
		case 4:
			res=division(n1,n2);
			cout<<"The Division of the two number is:"<<res<<endl;
			break;
		default:
			cout<<"Please! enter a right choice"<<endl;
	}
	cout<<"Do you want to continue:y/n: ";
	cin>>choice;
	}while(choice=='y');
	return 0;
}
