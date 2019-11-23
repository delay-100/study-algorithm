// 두 개의 텍스트 파일을 서로 비교하는 프로그램
// 파일의 이름은 사용자에게 입력 받음
// 일차하면 isSame을 출력, 일치하지 않으면 일치하지 않는 문장을 출력

#include <stdio.h>
#include <string.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    char a[100], b[100];
    int isSame = 0;

    printf("First file name: ");
    scanf("%s", n1);
    printf("\nSecond file name: ");
    scanf("%s", n2);

    f1 = fopen(n1, "r");
    f2 = fopen(n2, "r");

    while(!feof(f1)){
        fgets(a, sizeof(a), f1);
        fgets(b, sizeof(b), f2);

        if(strcmp(a, b)!=0){
            isSame = 0;
            printf("\n>> %s", a);
            printf("<< %s", b);
            break;
        }
        else
            isSame = 1;
    }
    if(isSame == 1)
        printf("\nisSame");
    
    fclose(f1);
    fclose(f2);
    return 0;
}