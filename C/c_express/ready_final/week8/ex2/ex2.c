// sample1파일의 소문자를 대문자로 저장하여 sample2에 저장하는 프로그램

#include <stdio.h>
#include <string.h>
#include <ctype.h>


int main(void){
    char a, u;
    FILE *f = fopen("sample1.txt", "r+");
    FILE *f2 = fopen("sample2.txt", "w+");

    while(!feof(f)){
        a = fgetc(f);
        if(islower(a)){
            u = toupper(a);
            fputc(u, f2);
        }
        else
            fputc(a, f2);        
    }    


    fclose(f);
    fclose(f2);
    return 0;
}