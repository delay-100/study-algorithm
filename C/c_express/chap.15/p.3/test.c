// 하나의 파일을 다른 이름의 파일로 복사하는 프로그램
// 이진파일이라고 가정하고 fread()와 fwrite를 사용

#include <stdio.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    char buffer[100];
    int count =0;

    printf("Orignal file name: ");
    scanf("%s", &n1);
    printf("\nCopy file name: ");
    scanf("%s\n", &n2);

    f1 = fopen(n1, "rb");
    f2 = fopen(n2, "wb");

    while((count = fread(buffer, sizeof(char), sizeof(buffer), f1)) != 0)
        fwrite(buffer, sizeof(char), count, f2);


    fclose(f1);
    fclose(f2);
    return 0;
}