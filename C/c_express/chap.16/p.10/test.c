/**
 * 암호화 방법 중의 하나는 암호화할 값을 키값과 비트 XOR연산을 하는 것이다.
 * 원래의 값을 복원하려면 다시 비트 XOR연산을 하면 된다.
 * 이 암호화 방법을 사용하여 사용자로부터 문자열을 입력받아서
 * 암호화하고 다시 복호화하는 프로그램을 작성하라
 * 다중 소스 파일 형태로 작성하라
 **/

#include <stdio.h>

void print(char a[]){
    int i;
    for(i=0; i<a[i]!='\0'; i++){
        printf("%c", a[i]);
    }
}
int main(void){

    char s[100];
    int i;
    int key=24;

    printf("put string: ");
    gets(s);

    printf("\n");
    print(s);
    printf(" to ");
    for(i=0; s[i]!='\0'; i++)
        s[i]=s[i]^key;
    print(s);    
    printf(" encoding\n");
    
    print(s);
    printf(" to ");
    for(i=0; s[i]!='\0'; i++)
        s[i]=s[i]^key;
    print(s);        
    printf(" decoding\n");

    return 0;
}