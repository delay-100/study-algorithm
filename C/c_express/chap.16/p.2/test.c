/*
 *  3개의 정수 중에서 최소값을 구하는 매크로 GET_MIN(x,y,z)를 정의하고 
 *  이 것을 이용하여서 사용자로부터 받은 3개의 정수 중에서 최소값을 계산하여서 출력하는 프로그램
*/

#include <stdio.h>
#define GET_MIN(x,y,z) ( (x>y) ? ( (y>z) ? z : y) : ( (x>z) ? z: x) )

int main(void){

    int a, b, c;
    
    printf("3num integer input: ");
    scanf("%d %d %d", &a,&b,&c);
    printf("\n%d\n", GET_MIN(a, b, c));
    return 0;
}