//WAP to do a modular code for char array
//1.Function for accept array element
//2.Function for copy array element into another one
//3.function for printing the array element

#include<iostream>
using namespace std;
 //1
 void accept(char *arr,int size){
        for(int i=0;i<size;i++){
                cout<<"Enter the elemetn into the array:";
                cin>>arr[i];
        }
 }

//2
void copy(char *arr,char *array,int size){
        for(int  i=0;i<size;i++){
		array[i]=arr[i];
	} 
}

//3
void display(char *array,int size){
        for(int i=0;i<size;i++){
                cout<<array[i]<<"\t";
        }
}
int main(){
        int size;
        char arr[size]={};
	char array[size]={};
        cout<<"Enter the size of the array:";
        cin>>size;
        accept(arr,size);
        copy(arr,array,size);
        display(array,size);
        return 0;
}
