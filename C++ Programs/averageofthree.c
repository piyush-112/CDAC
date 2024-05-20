#include<stdio.h>

int main(){

int a, b, c, avg;
printf("Enter three numbers");
scanf("%d %d %d", &a, &b, &c);

avg= (a+b+c)/3;
printf("Average is", avg);

return 0;

}

// #include <stdio.h>

// int main() {
//     int num1, num2, num3, average;

//     printf("Enter three numbers: ");
//     scanf("%d %d %d", &num1, &num2, &num3);

//     average = (num1 + num2 + num3) / 3;

//     printf("The average of the three numbers is: %.2f\n", average);

//     return 0;
// }