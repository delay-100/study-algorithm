/**
 * 비트 연산자를 이용하여 대소문자를 변경할 수 있다.
 * 대문자의 아스키 코드는 모두 여섯 번째 비트를 바꿔주면 대소문자가 바뀌게 된다.
 * 이 성질을 이용하여 사용자가 입력한 문자열의 대소문자를 바꾸는 프로그램
 * 앞 문제에서 작성한 display_bit()함수를 사용
 **/

// 수정
// display_bit()함수를 이용할 것

#include <stdio.h>

int main(void){
    char s[100];
    int i=0;

    printf("put string: ");
    gets(s);
    printf("\nresult: ");
    while(s[i]!='\0'){
        printf("%c", s[i]^0x20);
        i++;
    }
    printf("\n");


    return 0;
}