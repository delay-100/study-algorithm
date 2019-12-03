/**
 * 텍스트 파일에서 특정한 단어를 찾아서 다른 단어로 변경하여 출력 파일에 쓰는 프로그램
 **/

// 수정할 부분
// 파일이 여러 줄일 경우 줄의 앞에 띄어쓰기가 됨
//                     마지막 단어만 바뀜

#include <stdio.h>
#include <string.h>

#define SIZE 100

int main(void){

    FILE *f = fopen("example.txt", "r");
    FILE *r = fopen("remake.txt", "w+");
    char rw[100];
    char ww[100];
    char buffer[SIZE];
    char *token;
    int count = 0;
    printf("remake word: ");
    scanf("%s", rw);
    printf("\nwant word: ");
    scanf("%s", ww);

    while(!feof(f)){

        fgets(buffer, SIZE, f);

        token = strtok(buffer, " ");

        while(token != NULL){
            if(strcmp(token, rw) ==0){
                fputs(ww, r);

            }
            else{
                fputs(token, r);

            }
            fputs(" ", r);
            token = strtok(NULL, " ");

        }
    }

    fclose(f);
    fclose(r);
    return 0;
}