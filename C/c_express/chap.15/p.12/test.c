/**
 * 파일에서 특정한 단어를 찾아서 파일 이름과 단어가 위치한 줄 번호를 출력하는 프로그램
 **/

#include <stdio.h>
#include <string.h>
#define SIZE 100

int main(void){
    char n[100];
    char sw[100];
    char c[SIZE];
    FILE *f;
    int count = 1;

    printf("File name: ");
    scanf("%s", &n);
    printf("\nscan word: ");
    scanf("%s", &sw);
    f = fopen(n, "r+");

    while(!feof(f)){
        fgets(c, SIZE, f);
        if(strstr(c,sw)!=NULL){
            printf("%s: %d   %s\n", n, count, c);
        }
        count++;
    }

    fclose(f);
    return 0;
}