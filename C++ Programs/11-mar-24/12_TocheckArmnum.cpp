//WAP to check if input number is armstrong or not

#include<iostream>
using namespace std;
int main(){
	int num;
	cout<<"Enter the number :";
	cin>>num;
	int sum=0;
	int n=0;
	int num1=num;
	while(num1!=0){
		num1=num1/10;
		n++;
	}
//	cout<<"Total number of digit:"<<n<<endl;
	num1=num;
	while(num!=0){
		int rem=num%10;
		int dummysum=1;
		for(int i=0;i<n;i++){
			dummysum=dummysum*rem;
		}

		 sum=sum+dummysum;
		num=num/10;
	}
	cout<<sum<<endl;
	if(sum==num1){
		cout<<"The entered number is Armstrong number"<<endl;
	}
	else{
		cout<<"Not Arstrong number"<<endl;
	}
	return 0;
}
