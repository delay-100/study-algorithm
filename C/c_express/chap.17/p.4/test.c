/**
 * 사용자로부터 단어를 입력받는 공간을 동적 메모리로 할당받아 보자
 * 단어의 최대 크기는 50이라고 가정
 * 단어의 주소를 반환하는 함수 char *get_word()를 사용
 **/

#include <stdio.h>
#include <stdlib.h>

// 단어의 주소를 반환하는 함수
char *get_word(){
    char * s = (char *)malloc(50*sizeof(char *));
    if(s==NULL){
        printf("memory error\n");
        exit(1);
    }
    printf("word(max length = 50): ");
    scanf("%s", s);
    printf("\n");

    return s;
}


int main(void){
    char *a = get_word();
    printf("Dynamic memory is %s.", a);

    return 0;
}