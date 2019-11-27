/**
 * 텍스트 파일을 읽어서 각 줄의 앞에 줄 번호를 붙이는 프로그램
 * 줄 번호는 폭이 6이고 오른쪽 정렬되도록 함
 **/

#include <stdio.h>
#define SIZE 100

int main(void){

    FILE *f = fopen("example.txt", "r");
    char n[SIZE];
    char count=1;

    while(!feof(f)){
        fgets(n, SIZE ,f);
        printf("%d:      %s", count, n);
        count++;
    }

    fclose(f);
    return 0;
}