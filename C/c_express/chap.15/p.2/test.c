// 텍스트 파일을 열어서 파일 안에 들어 있는 문자들을 
// 모두 대문자로 변경하여 새로운 파일에 저장하는 프로그램

#include <stdio.h>
#include <ctype.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    char a ='\0';
    char buffer[100]={0, };
    
    printf("First file name: ");
    scanf("%s", n1);
    printf("\nSecond file name: ");
    scanf("%s", n2);
    printf("\n");

    f1 = fopen(n1, "r");
    f2 = fopen(n2, "w+");

    while((a =fgetc(f1)) != EOF){

        if(islower(a))
            a = toupper(a);
        fputc(a, f2);
    }
    
    fflush(f2);
    fseek(f2, 0L, 0);
    
    while(fgets(buffer, sizeof(buffer) ,f2) !=NULL){
        printf("%s", buffer);
    }

    fclose(f1);
    fclose(f2);
    return 0;
}