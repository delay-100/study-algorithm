/**
 * 사용자로부터 입력받은 정수를 비트 이동시키는 프로그램을 작성
 * 정수 변수의 값을 입력받은 후에 이동시킬 방향, 이동할 거리를 사용자로부터 입력받음
 * 비트 이동 전후에 정수의 값을 비트로 출력하도록 함
 * display_bit()함수를 사용
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
        printf("%d", GET_BIT(value, i));
        count++;
    }
}

int main(void){
    int value, where, how;
    int i, n=1;

    printf("put num: ");
    scanf("%d", &value);
    printf("\ninput left shift 0, right shift 1 : ");
    scanf("%d",&where);
    printf("\nhow many shift: ");
    scanf("%d", &how);

    printf("\nbefore shift: ");
    display_bit(value);
    printf("\nafter shift: ");

    if(where == 0)
        value<<=how;
    else if(where == 1)
        value>>=how;
    display_bit(value);
        
    return 0;
}