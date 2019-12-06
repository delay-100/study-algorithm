/**
 * 길이가 100인 n개의 문자열을 저장하는데 필요한 동적 메모리를 할당해보자
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
    int num;
    char **s = NULL;
    int i;

    printf("string num: ");
    scanf("%d", &num);
    s = malloc(num*sizeof(char *));
    if(s != NULL){
        for(i=0; i<num; i++)
            s[i] = (char *)malloc(100);
    }
    printf("\n");
    printf("[ ");
    for(i=0; i<num; i++){
        strcpy(s[i], "string");
        printf("\"%s%d\" ", s[i], i);
    }
    printf("]");

    free(s);
    return 0;
}