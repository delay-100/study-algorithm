#include<stdio.h>

int main(void){

    int num1, num2;
    int a, b, c;

    scanf("%d", &num1);
    scanf("%d", &num2);

    //3자리 수에서 일의 자리 수를 구한다
    a = num2%10;
    printf("%d\n",a*num1);
    //3자리 수에서 십의 자리 수를 구한다
    b = ((num2%100)-a)/10;
    printf("%d\n",b*num1);
    //3자리 수에서 백의 자리 수를 구한다
    c = (num2-(b*10+a))/100;
    printf("%d\n",c*num1);


    printf("%d\n", num1*num2);
    return 0;
}