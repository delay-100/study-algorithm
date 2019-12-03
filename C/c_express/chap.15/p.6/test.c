/**
 * 사용자로부터 받은 파일 이름으로 텍스트 파일을 연 후 
 * 파일 안에 들어 있는 인쇄 가능한 문자들의 개수를 계산하여 출력하는 프로그램
 * */

#include <stdio.h>
#include <ctype.h>

int main(void){

    FILE *f;
    char n[100];
    int count = 0;

    printf("File name: ");
    scanf("%s", n);

    f = fopen(n, "r");
    
    while(!feof(f)){
        if(isprint(fgetc(f)) !=0){
            count++;
        }
    }

    printf("\nisprint num : %d", count);
    fclose(f);

    return 0;
}