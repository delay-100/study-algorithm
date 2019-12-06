/**
 * 사용자가 입력하는 텍스트를 파일에 저장하여 주는 프로그램
 * ctrol-z를 누르면 종료된다
 **/

#include <stdio.h>
#define SIZE 100

int main(void){

    FILE *f;
    char n[100];
    char c[SIZE];

    printf("File name: ");
    scanf("%s", n);
    f = fopen(n, "w+");

    while(1){
        if(fgets(c,SIZE, stdin) ==0) // fgets가 0을 반환하면 공백임
            break;
        fputs(c, f);
    }
    fclose(f);
    return 0;
}