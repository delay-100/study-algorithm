/**
 * c가 공백문자(탭, 스페이스, 줄바꿈 문자)이면 참이 되는 매크로 IS_SPACE(c)를 정의하여서 
 * 사용자가 입력한 문자열 중에서 공백 문자의 개수를 출력
 **/

#include <stdio.h>
#define SIZE 100
#define IS_SPACE(c) (c==' '||c=='\t'||c=='\n') ? 1 : 0

int main(void){
    char s[SIZE];
    int i, num;
    int count = 0;

    printf("String: ");
    gets(s);

    for(i =0; i<SIZE; i++){
        num = IS_SPACE(s[i]);
        if(num == 1)
            count++;
        else;
        
    }

    printf("\nBlank num: %d", count);
    
    return 0;
}