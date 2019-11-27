/**
 * 명령어 라인으로 주어진 2개의 텍스트 파일을 합하여 
 * 하나의 파일로 만드는 프로그램
 **/

#include <stdio.h>
#define SIZE 100

int main(int arc, char*argv[]){
    // 명령어 라인 사용시
    // FILE *h = fopen("%s.c", argv[1], "r");
    FILE *h = fopen("hello.c", "r+");
    FILE *m = fopen("main.c", "r+");
    FILE *d = fopen("dst.c", "w+");
    char a[SIZE];

    while(!feof(h)){
        fgets(a,SIZE, h);
        fputs(a, d);
    }
    fputs("\n", d);
    while(!feof(m)){
        fgets(a,SIZE, m);
        fputs(a, d);
    }

    printf("hello.c file + main.c file => dst.c strcpy");
    // 명령어 라인 사용시
    // printf("%s.c file + %s.c file => %s.c strcpy", argv[1], argv[2], argv[3]);
    fclose(h);
    fclose(m);
    fclose(d);
    return 0;
}