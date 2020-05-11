// 입력하는 파일을 그대로 출력하는 프로그램
#include <stdio.h>

int main(void){
    
    int i=0;
    char buffer[100];
    FILE* f = fopen("ex1.c", "r+");

    while(!feof(f)){
        fgets(buffer, 100, f);
        printf("%d: %s", i, buffer);
        i++;
    }

    fclose(f);
    return 0;
}