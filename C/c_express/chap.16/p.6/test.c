// 비트를 조작하는 다음의 매크로를 작성하고 동작을 확인

#include <stdio.h>
// 변수 n안에 있는 pos번째 비트를 1로 설정함
#define SET_BIT(n, pos) ((n)|=(0x01<<(pos)))
// 변수 n 안에 있는 pos번째 비트를 0으로 설정함
#define CLR_BIT(n, pos) ( n &= (~(0x01 << pos)) )
// 변수 n안에 있는 pos번째 비트를 반환
#define GET_BIT(n, pos) (((n)>>(pos)) & 0x01)

int main(void){
    int n;

    printf("put num: ");
    scanf("%x", &n);
    printf("\nGET_BIT(): %x\n", GET_BIT(n,0));
    printf("SET_BIT(%x)\n", SET_BIT(n, 2));
    CLR_BIT(n, 0);
    printf("%x", n);
    
    

    return 0;
}