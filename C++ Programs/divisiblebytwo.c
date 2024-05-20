#include<stdio.h>

int main(){

    int c;
    printf("Enter no.");
    scanf("%d", &c);

    if(c%2==0){
        printf("Number is divisible by 2");
    }
    else{
        printf("Numebr is not divisible by 2");
    }

    return 0;
}