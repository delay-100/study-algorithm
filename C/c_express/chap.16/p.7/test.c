/** 정수값을 입력받아서 2진수 형태로 출력하는 함수 display_bit(int value)를 작성함
 * GET_BITT(n,pos)를 사용함
 **/

#include <stdio.h>
// 변수 n안에 있는 pos번째 비트를 0또는 1로 반환 / 0을 반환하면 if에서 false가 됨
#define GET_BIT(n,pos) ((n)>>(pos)&0x01)

void display_bit(int value){
    int count = 0;
    int i;

    for(i=31;i>=0;i--){
        if(count==4){
            printf(" ");
            count = 0;
        }
        if(GET_BIT(value,i)) // 만약 num(ex.10)안에 있는 31번째 비트를 0(거짓)으로 반환하면 0
            printf("1");
        else
            printf("0");
        count++;
    }
}

int main(void){ 
    int value;

    printf("input num: ");
    scanf("%d", &value);

    printf("\n");
    display_bit(value);
    return 0;
}