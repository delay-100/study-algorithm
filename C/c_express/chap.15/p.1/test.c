// 두 개의 텍스트 파일을 비교하여 같은지 다른지를 알려주는 프로그램

#include <stdio.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    int isSame = 0;

    printf("first file name:  ");
    scanf("%s", &n1);
    printf("\nsecond file name: ");
    scanf("%s", &n2);

    f1 = fopen(n1, "r");
    f2 = fopen(n2, "r");

    while(!feof(f1)){
        if(fgetc(f1) == fgetc(f2)){
            isSame = 1;
        }
        else
            isSame = 0;
    }

    if(isSame == 1)
        printf("\nis same");
    else
        printf("\nis different");
    
    
    fclose(f1);
    fclose(f2);
    return 0;
}