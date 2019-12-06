/**
 * 동적 메모리 할당을 이용하여서 사용자로부터 양의 정수들의 합을 구하는 프로그램을 작성하라
 * 사용자로부터 먼저 정수의 개수를 입력받도록 하라
 **/

#include <stdio.h>
#include <stdlib.h>

int main(void){
    int num, i;
    int sum=0;
    int* p;

    printf("input integer num: ");
    scanf("%d", &num);
    printf("\n");

    p = (int *)malloc(num*sizeof(int));
    for(i=0; i<num; i++){
        printf("input integer: ");
        scanf("%d" , &p[i]);
        sum += p[i];
        printf("\n");
    }

    printf("sum is : %d", sum);
    free(p);
    return 0;
}