#include<stdio.h>
#include<ctype.h>

int main(){

    char c;
    printf("Enter a character");
    scanf("%c", &c);

    if(isdigit(c)){
        printf("The character is digit");
    }
    else{
        printf("The character is not digit");
    }

    return 0;
}