//WAP to print tha multiplication of the 3*3 matrix

#include<iostream>
using namespace std;
void accept( int a[3][3],int b[3][3]){
	cout<<"Enter the element into the array a:"<<endl;
          for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                         cin>>a[i][j];
                  }
          }
	cout<<"Enter the element into the secod array:"<<endl;
          for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                         cin>>b[i][j];
                  }
          }
}


void display(int multi[3][3],int a[3][3],int b[3][3]){
	 cout<<"Lets the multiply :"<<endl;
          for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                          multi[i][j]=0;
                          for(int k=0;k<3;k++){
                                  multi[i][j]+=a[i][k]*b[i][k];
                          }
                  }
          }
          for(int i=0;i<3;i++){
                  for(int j=0;j<3;j++){
                          cout<<multi[i][j]<<" ";
                  }
                  cout<<"\n";
          }

}
int main(){
	int a[3][3],b[3][3],multi[3][3];
	accept(a,b);
	display(multi,a,b);
	
	return 0;
}
