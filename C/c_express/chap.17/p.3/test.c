/**
 * 동적 메모리 할당을 이용하여서 사용자로부터 받은 주소록을 저장하고 출력하는 프로그램을 작성함
 * 사용자로부터 먼저 주소의 개수를 입력받도록 함
 * 주소의 많은 정보 중에서 이름과 휴대폰 번호만을 저장하도록 함
 **/

#include <stdio.h>
#include <stdlib.h>

typedef struct CALL {
    char name[100];
    char number[100];
}call;

int main(void){
    int count, i;
    call *c;

    printf("phone num count : ");
    scanf("%d", &count);
    getchar();
    printf("\n");
    c = (struct CALL*)malloc(count*sizeof(struct CALL));

    if(c == NULL){
        printf("error\n");
        exit(1);
    }
    for(i=0; i<count; i++){
        printf("name: ");
        gets(c[i].name);
        printf("\nphone number: ");
        gets(c[i].number);
        printf("\n");
        getchar();
    }
    printf("\n==========================\n");
    printf("name         phone number \n");
    printf("==========================\n");

    for(i=0; i<count; i++){
        printf("%s %s\n", c[i].name, c[i].number);
    }
    printf("==========================\n");

    free(c);
    return 0;
}