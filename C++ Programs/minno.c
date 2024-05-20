#include<stdio.h>

int main(){
    
    int a, b, min;
    printf("Enter two no");
    scanf("%d %d", &a, &b);

    min = a;

    if(min>b){
        printf("is minimum", min);
    }
    else{
        printf("is minimum", b);
    }

    return 0;
}