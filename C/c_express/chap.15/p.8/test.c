/**
 * 임이의 실수 100개를 생성시킨 후에 텍스트 파일과 이진 파일로 저장하여 보고
 * 그 크기를 비교하는 프로그램
 **/

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SIZE 100


int main(void){
    int random;
    int random2[100];
    int i;
    int t;

    FILE *f = fopen("sample1.txt", "w+");
    FILE *b = fopen("sample2.txt", "wb");

    srand(time(NULL));

    for(i=0; i<SIZE; i++){
        t = rand();
        random = t;
        random2[i] = t;
        fprintf(f, "%d", random );
    }
    fwrite(random2, sizeof(int), SIZE, b );

    fclose(f);
    fclose(b);
    return 0;
}


/**
 * 결과 : binary 파일이 txt 파일보다 크기가 더 작다.
 **/