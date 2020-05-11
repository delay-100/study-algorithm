// ./chap.15\p.1/test.c
// 두 개의 텍스트 파일을 비교하여 같은지 다른지를 알려주는 프로그램

#include <stdio.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    int isSame = 0;

    printf("first file name:  ");
    scanf("%s", n1);
    printf("\nsecond file name: ");
    scanf("%s", n2);

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


//****************************************************************************//
// ./chap.15\p.10/test.c
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


//****************************************************************************//
// ./chap.15\p.11/test.c
/**
 * 소규모의 데이터베이스 프로그램 작성
 * 자기가 소유하고 있는 도서를 관리하는 프로그램
 **/

#include <stdio.h>
#include <string.h>

typedef struct BOOK{
    char title[100];
    char Author[100];
    char Publisher[100];
}BOOK;

void menu(){
    printf("================\n");
    printf("1. add\n");
    printf("2. print\n");
    printf("3. search\n");
    printf("4. exit\n");
    printf("================\n");

}

int scan_name(){
    int a;

    printf("select num: ");
    scanf("%d", &a);

    return a;
}

void add_book(BOOK* list ,int count){
    printf("title name : ");
    scanf("%s", &list[count].title);
    printf("Author name: ");
    scanf("%s", &list[count].Author);    
    printf("Publisher name : ");
    scanf("%s", &list[count].Publisher);

}


void print_list(BOOK* list ,int count){
    int i;
    for(i=0; i<count; i++){
        printf("title: %s\n", list[i].title);
        printf("Author: %s\n", list[i].Author);
        printf("Publisher: %s\n", list[i].Publisher);
        printf("\n");
    }
}

void search_book(BOOK* list ,int count){
    int i;
    char title[100];
    int found = 0;
    printf("title name: ");
    scanf("%s", title);
    for(i=0; i<count; i++){
        if(!strcmp(title, list[i].title) !=0){
            printf("Author: %s\n", list[i].Author);
            printf("Publisher: %s\n", list[i].Publisher);
            found = 1;
        }
    }
    if(found ==0){
        printf("book not found");
    }
}

int main(void){
    BOOK list[100];
    int a;
    int istrue = 0;
    int count = 0;

    while(istrue != 1){
        menu();
        a = scan_name();

        switch(a){

            case 1 : { add_book(list, count); count++; break; }

            case 2 : { print_list(list, count); break; }
        
            case 3 : { search_book(list, count); break; }

            case 4 : { istrue = 1; break; }
                
        }
    }
    printf("exit");

    return 0;
}



//****************************************************************************//
// ./chap.15\p.12/test.c
/**
 * 파일에서 특정한 단어를 찾아서 파일 이름과 단어가 위치한 줄 번호를 출력하는 프로그램
 **/

#include <stdio.h>
#include <string.h>
#define SIZE 100

int main(void){
    char n[100];
    char sw[100];
    char c[SIZE];
    FILE *f;
    int count = 1;

    printf("File name: ");
    scanf("%s", n);
    printf("\nscan word: ");
    scanf("%s", sw);
    f = fopen(n, "r+");

    while(!feof(f)){
        fgets(c, SIZE, f);
        if(strstr(c,sw)!=NULL){
            printf("%s: %d   %s\n", n, count, c);
        }
        count++;
    }

    fclose(f);
    return 0;
}


//****************************************************************************//
// ./chap.15\p.13/test.c
/**
 * 텍스트 파일에서 특정한 단어를 찾아서 다른 단어로 변경하여 출력 파일에 쓰는 프로그램
 **/

// 수정할 부분
// 파일이 여러 줄일 경우 줄의 앞에 띄어쓰기가 됨
//                     마지막 단어만 바뀜

// 수정 완료
// fgets에서 자동으로 입력되는 버퍼를 삭제해줌
// 그 후 fputs로 다시 개행문자를 추가해줌

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
        buffer[strlen(buffer)-1] = '\0';

        if(strstr(buffer, rw)!=NULL){
            token = strtok(buffer, " ");

            while(token != NULL){
                if(strcmp(token, rw) ==0){
                    fputs(ww, r);
                }
                else
                    fputs(token, r);
                fputs(" ", r);

                token = strtok(NULL, " ");
            }
        }
        else
        {
            fputs(buffer, r);
        }
        fputs("\n", r);
    }

    fclose(f);
    fclose(r);
    return 0;
}


//****************************************************************************//
// ./chap.15\p.2/test.c
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


//****************************************************************************//
// ./chap.15\p.3/test.c
// 하나의 파일을 다른 이름의 파일로 복사하는 프로그램
// 이진파일이라고 가정하고 fread()와 fwrite를 사용

#include <stdio.h>

int main(void){
    FILE *f1, *f2;
    char n1[100], n2[100];
    char buffer[100];
    int count =0;

    printf("Orignal file name: ");
    scanf("%s", n1);
    printf("\nCopy file name: ");
    scanf("%s\n", n2);

    f1 = fopen(n1, "rb");
    f2 = fopen(n2, "wb");

    while((count = fread(buffer, sizeof(char), sizeof(buffer), f1)) != 0)
        fwrite(buffer, sizeof(char), count, f2);


    fclose(f1);
    fclose(f2);
    return 0;
}


//****************************************************************************//
// ./chap.15\p.4/test.c
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


//****************************************************************************//
// ./chap.15\p.5/test.c
// 학생들의 교과목 성적이 저장되어 있는 텍스트 파일을 읽어서
// 성적의 평균을 구하여 파일에 쓰는 프로그램
// 평균은 소수점 2자리까지 나타냄

#include <stdio.h>

struct student {
    char name[10];
    int korean;
    int math;
    int english;
}s;

int main(void){
    FILE *f = fopen("student.txt", "r");
    FILE *f1 = fopen("studentmin.txt", "w");
    int min = 0;

    fprintf(f1, "name min\n");
    fscanf(f, "%s %s %s %s\n", s.name, &s.korean, &s.math, &s.english);
    while(0 < fscanf(f, "%s %d %d %d\n", &s.name, &s.korean, &s.math, &s.english)){
        min = ( s.korean + s.math + s.english )/3;
        fprintf(f1, "%s %d\n", s.name, min);
    }


    fclose(f);
    return 0;
}


//****************************************************************************//
// ./chap.15\p.6/test.c
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


//****************************************************************************//
// ./chap.15\p.7/example.c

#include <stdio.h>
int main(void){
    printf("hello");
    return 0;
}
^Z


//****************************************************************************//
// ./chap.15\p.7/test.c
/**
 * 사용자가 입력하는 텍스트를 파일에 저장하여 주는 프로그램
 * ctrol-z를 누르면 종료된다
 **/

#include <stdio.h>
#define SIZE 100

int main(void){

    FILE *f;
    char n[100];
    char c[SIZE];

    printf("File name: ");
    scanf("%s", n);
    f = fopen(n, "w+");

    while(1){
        if(fgets(c,SIZE, stdin) ==0) // fgets가 0을 반환하면 공백임
            break;
        fputs(c, f);
    }
    fclose(f);
    return 0;
}


//****************************************************************************//
// ./chap.15\p.8/test.c
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


//****************************************************************************//
// ./chap.15\p.9/dst.c
#include <stdio.h>

int main(void){
    printf("hello!");
    return 0;
}
#include <stdio.h>

int main(void){
    printf("main file");
    return 0;
}


//****************************************************************************//
// ./chap.15\p.9/hello.c
#include <stdio.h>

int main(void){
    printf("hello!");
    return 0;
}


//****************************************************************************//
// ./chap.15\p.9/main.c
#include <stdio.h>

int main(void){
    printf("main file");
    return 0;
}


//****************************************************************************//
// ./chap.15\p.9/test.c
/**
 * 명령어 라인으로 주어진 2개의 텍스트 파일을 합하여 
 * 하나의 파일로 만드는 프로그램
 **/

#include <stdio.h>
#define SIZE 100

int main(int arc, char*argv[]){
    // 명령어 라인 사용시
    // FILE *h = fopen("%s.c", argv[1], "r");
    FILE *h = fopen("hello.c", "r+");
    FILE *m = fopen("main.c", "r+");
    FILE *d = fopen("dst.c", "w+");
    char a[SIZE];

    while(!feof(h)){
        fgets(a,SIZE, h);
        fputs(a, d);
    }
    fputs("\n", d);
    while(!feof(m)){
        fgets(a,SIZE, m);
        fputs(a, d);
    }

    printf("hello.c file + main.c file => dst.c strcpy");
    // 명령어 라인 사용시
    // printf("%s.c file + %s.c file => %s.c strcpy", argv[1], argv[2], argv[3]);
    fclose(h);
    fclose(m);
    fclose(d);
    return 0;
}


//****************************************************************************//
// ./chap.16\p.1/test.c
#include <stdio.h> //전처리기 지시자0
#define DEBUG 2
#define LEVEL 3
#define POWER_TYPE 0 // POWER_TYPE라는 매크로 정의

#if POWER_TYPE == 0
    double power(int x, int y){
        double result = 1.0;
        int i;

        for(i = 0; i<y; i++){
            printf("result = %d\n", (int)result);
            result *=x;
        }
        return result;
    }
#elif POWER_TYPE ==1
    double power(int x, int y){
        double result = 1.0;
        int i;

        for(i=0; i<y; i++){
            #if 0
            printf("result=%f\n",result); 문장 1
            #endif
            printf("line = %d, result= %f\n",__LINE__, result);
            result *= x;
        }

        return result;
    }
#endif

int main(void){

    
    #ifdef DEBUG //(a) DEBUG가 정의되어 있는 경우에만 화면 출력이 나오도록 함
        power(2,11);
    #endif

    #if (DEBUG == 2) // (b) DEBUG가 2일 경우에만 화면 출력이 나오도록 함
        power(2,11);
    #endif

    #if (DEBUG ==2 && LEVEL == 3) //(c) DEBUG가 2이고 LEVEL이 3인 경우에만 화면 출력이 나오도록 수정 함
        power(2, 11);
    #endif

    return 0;
}


//****************************************************************************//
// ./chap.16\p.10/test.c
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


//****************************************************************************//
// ./chap.16\p.2/test.c
/*
 *  3개의 정수 중에서 최소값을 구하는 매크로 GET_MIN(x,y,z)를 정의하고 
 *  이 것을 이용하여서 사용자로부터 받은 3개의 정수 중에서 최소값을 계산하여서 출력하는 프로그램
*/

#include <stdio.h>
#define GET_MIN(x,y,z) ( (x>y) ? ( (y>z) ? z : y) : ( (x>z) ? z: x) )

int main(void){

    int a, b, c;
    
    printf("3num integer input: ");
    scanf("%d %d %d", &a,&b,&c);
    printf("\n%d\n", GET_MIN(a, b, c));
    return 0;
}


//****************************************************************************//
// ./chap.16\p.3/test.c
/**
 * 배열 원소의 값을 모두 지정된 값으로 초기화하는 ARRAY_INIT(array, size, value)를 작성하여 테스트
 **/

#include <stdio.h>
#define SIZE 10
#define ARRAY_INIT(array,size,value) \
        int i; \
        for(i =0; i<size; i++) { \
            array[i] = value; \
        } 

int main(void){
    char array[SIZE];
    int j;
    ARRAY_INIT(array, SIZE, 0);
    printf("[ ");
    for(j = 0; j<SIZE; j++)
        printf("%d ", array[j]);
    printf("]");
    return 0;
}


//****************************************************************************//
// ./chap.16\p.4/test.c
/** 원기둥의 부피는 파이(3.14...)*(반지름)^2*높이 이다.
 * 사용자로부터 반지름과 높이를 받아서 원기둥의 부피를 구하는 프로그램
 * 파이는 단순 매크로로 정의한다. 원기둥의 부피를 구하는 공식은 함수 매크로로 정의한다.
 **/

#include <stdio.h>
#define M_PI 3.141592
#define VALUME(r,h) (M_PI)*(r)*(r)*(h)

int main(void){
    int r,h;

    printf("Cylinder volume calculator\n");
    printf("put radius: ");
    scanf("%d", &r);
    printf("\nput height: ");
    scanf("%d", &h);
    printf("\nvolume: %f", VALUME(r,h));

    return 0;
}


//****************************************************************************//
// ./chap.16\P.5/test.c
/**
 * c가 공백문자(탭, 스페이스, 줄바꿈 문자)이면 참이 되는 매크로 IS_SPACE(c)를 정의하여서 
 * 사용자가 입력한 문자열 중에서 공백 문자의 개수를 출력
 **/

#include <stdio.h>
#define SIZE 100
#define IS_SPACE(c) (c==' '||c=='\t'||c=='\n') ? 1 : 0

int main(void){
    char s[SIZE];
    int i, num;
    int count = 0;

    printf("String: ");
    gets(s);

    for(i =0; i<SIZE; i++){
        num = IS_SPACE(s[i]);
        if(num == 1)
            count++;
        else;
        
    }

    printf("\nBlank num: %d", count);
    
    return 0;
}


//****************************************************************************//
// ./chap.16\p.6/test.c
// 비트를 조작하는 다음의 매크로를 작성하고 동작을 확인

#include <stdio.h>
// 변수 n안에 있는 pos번째 비트를 1로 설정함
#define SET_BIT(n, pos) ((n)|=(0x01<<(pos)))
// 변수 n 안에 있는 pos번째 비트를 0으로 설정함
#define CLR_BIT(n, pos) ( n &= (~(0x01 << pos)) )
// 변수 n안에 있는 pos번째 비트를 반환
#define GET_BIT(n, pos) (((n)>>(pos)) & 0x01)

int main(void){
    int n;

    printf("put num: ");
    scanf("%x", &n);
    printf("\nGET_BIT(): %x\n", GET_BIT(n,0));
    printf("SET_BIT(%x)\n", SET_BIT(n, 2));
    CLR_BIT(n, 0);
    printf("%x", n);
    
    

    return 0;
}


//****************************************************************************//
// ./chap.16\p.7/test.c
/** 정수값을 입력받아서 2진수 형태로 출력하는 함수 display_bit(int value)를 작성함
 * GET_BITT(n,pos)를 사용함
 **/

#include <stdio.h>
// 변수 n안에 있는 pos번째 비트를 0또는 1로 반환 / 0을 반환하면 if에서 false가 됨
#define GET_BIT(n,pos) ((n)>>(pos)&0x01)

void display_bit(int value){
    int count = 0;
    int i;

    for(i=31;i>=0;i--){
        if(count==4){
            printf(" ");
            count = 0;
        }
        if(GET_BIT(value,i)) // 만약 num(ex.10)안에 있는 31번째 비트를 0(거짓)으로 반환하면 0
            printf("1");
        else
            printf("0");
        count++;
    }
}

int main(void){ 
    int value;

    printf("input num: ");
    scanf("%d", &value);

    printf("\n");
    display_bit(value);
    return 0;
}


//****************************************************************************//
// ./chap.16\P.8/test.c
/**
 * 사용자로부터 입력받은 정수를 비트 이동시키는 프로그램을 작성
 * 정수 변수의 값을 입력받은 후에 이동시킬 방향, 이동할 거리를 사용자로부터 입력받음
 * 비트 이동 전후에 정수의 값을 비트로 출력하도록 함
 * display_bit()함수를 사용
 **/

#include <stdio.h>
// 변수 n안에 있는 pos번째 비트를 0또는 1로 반환 / 0을 반환하면 if에서 false가 됨
#define GET_BIT(n,pos) ((n)>>(pos)&0x01)

void display_bit(int value){
    int count = 0;
    int i;

    for(i=31;i>=0;i--){
        if(count==4){
            printf(" ");
            count = 0;
        }
        printf("%d", GET_BIT(value, i));
        count++;
    }
}

int main(void){
    int value, where, how;
    int i, n=1;

    printf("put num: ");
    scanf("%d", &value);
    printf("\ninput left shift 0, right shift 1 : ");
    scanf("%d",&where);
    printf("\nhow many shift: ");
    scanf("%d", &how);

    printf("\nbefore shift: ");
    display_bit(value);
    printf("\nafter shift: ");

    if(where == 0)
        value<<=how;
    else if(where == 1)
        value>>=how;
    display_bit(value);
        
    return 0;
}


//****************************************************************************//
// ./chap.16\p.9/test.c
/**
 * 비트 연산자를 이용하여 대소문자를 변경할 수 있다.
 * 대문자의 아스키 코드는 모두 여섯 번째 비트를 바꿔주면 대소문자가 바뀌게 된다.
 * 이 성질을 이용하여 사용자가 입력한 문자열의 대소문자를 바꾸는 프로그램
 * 앞 문제에서 작성한 display_bit()함수를 사용
 **/

// 수정
// display_bit()함수를 이용할 것

#include <stdio.h>

int main(void){
    char s[100];
    int i=0;

    printf("put string: ");
    gets(s);
    printf("\nresult: ");
    while(s[i]!='\0'){
        printf("%c", s[i]^0x20);
        i++;
    }
    printf("\n");


    return 0;
}


//****************************************************************************//
// ./chap.17\p.1/test.c
/**
 * 동적 메모리 할당을 이용하여서 사용자로부터 양의 정수들의 합을 구하는 프로그램을 작성하라
 * 사용자로부터 먼저 정수의 개수를 입력받도록 하라
 **/

#include <stdio.h>
#include <stdlib.h>

int main(void){
    int num, i;
    int sum=0;
    int* p;

    printf("input integer num: ");
    scanf("%d", &num);
    printf("\n");

    p = (int *)malloc(num*sizeof(int));
    for(i=0; i<num; i++){
        printf("input integer: ");
        scanf("%d" , &p[i]);
        sum += p[i];
        printf("\n");
    }

    printf("sum is : %d", sum);
    free(p);
    return 0;
}


//****************************************************************************//
// ./chap.17\p.2/test.c
/**
 * 길이가 100인 n개의 문자열을 저장하는데 필요한 동적 메모리를 할당해보자
 **/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
    int num;
    char **s = NULL;
    int i;

    printf("string num: ");
    scanf("%d", &num);
    s = malloc(num*sizeof(char *));
    if(s != NULL){
        for(i=0; i<num; i++)
            s[i] = (char *)malloc(100);
    }
    printf("\n");
    printf("[ ");
    for(i=0; i<num; i++){
        strcpy(s[i], "string");
        printf("\"%s%d\" ", s[i], i);
    }
    printf("]");

    free(s);
    return 0;
}


//****************************************************************************//
// ./chap.17\p.3/test.c
/**
 * 동적 메모리 할당을 이용하여서 사용자로부터 받은 주소록을 저장하고 출력하는 프로그램을 작성함
 * 사용자로부터 먼저 주소의 개수를 입력받도록 함
 * 주소의 많은 정보 중에서 이름과 휴대폰 번호만을 저장하도록 함
 **/

#include <stdio.h>
#include <stdlib.h>

typedef struct CALL {
    char name[100];
    char number[100];
}call;

int main(void){
    int count, i;
    call *c;

    printf("phone num count : ");
    scanf("%d", &count);
    getchar();
    printf("\n");
    c = (struct CALL*)malloc(count*sizeof(struct CALL));

    if(c == NULL){
        printf("error\n");
        exit(1);
    }
    for(i=0; i<count; i++){
        printf("name: ");
        gets(c[i].name);
        printf("\nphone number: ");
        gets(c[i].number);
        printf("\n");
        getchar();
    }
    printf("\n==========================\n");
    printf("name         phone number \n");
    printf("==========================\n");

    for(i=0; i<count; i++){
        printf("%s %s\n", c[i].name, c[i].number);
    }
    printf("==========================\n");

    free(c);
    return 0;
}


//****************************************************************************//
// ./chap.17\p.4/test.c
/**
 * 사용자로부터 단어를 입력받는 공간을 동적 메모리로 할당받아 보자
 * 단어의 최대 크기는 50이라고 가정
 * 단어의 주소를 반환하는 함수 char *get_word()를 사용
 **/

#include <stdio.h>
#include <stdlib.h>

// 단어의 주소를 반환하는 함수
char *get_word(){
    char * s = (char *)malloc(50*sizeof(char *));
    if(s==NULL){
        printf("memory error\n");
        exit(1);
    }
    printf("word(max length = 50): ");
    scanf("%s", s);
    printf("\n");

    return s;
}


int main(void){
    char *a = get_word();
    printf("Dynamic memory is %s.", a);

    return 0;
}


//****************************************************************************//
// ./chap.17\p.5/test.c
/**
 * 사용자로부터 양의 정수들을 입력받아서 연결 리스트에 저장하고,
 * 그 결과를 출력하는 프로그램
 **/

#include <stdio.h>
#include <stdlib.h>

typedef struct NODE {   
    struct NODE *link;   
    int num;             
}NODE;

void print_list(NODE *list);
int get_integer();
NODE *prev, *p, *next;

int main(void){
	NODE *list = NULL;
	int n;
	while((n = get_integer()) != -1){
		p=(NODE*)malloc(sizeof(NODE)); 
        p->num=n; 
        if(list==NULL){ 
			list=p; 
		}
        else{		
			prev->link=p; 
		}
        prev=p;
	}
	p = list;
	print_list(list);

	while(p!=NULL){
        next=p->link;
        free(p);
        p=next;
    }

	return 0;
}


void print_list(NODE* list){
	while(1){
    if(p==NULL){  
		printf("NULL\n");
        break;
	}
    printf("%d->",p->num);
    p=p->link;
    }
}

int get_integer(){
	int num;
	
	printf("Input a apositive integer(Exit -1): ");
	scanf("%d", &num);

	return num;
}



//****************************************************************************//
// ./chap.17\p.6/test.c
/**
 * 전화 번호부를 연결 리스트를 이용하여 만들어보자
 * 사용자가 전화 번호를 입력하면 연결 리스트의 끝에 추가한다
 * 탐색 기능도 추가한다
 **/

// 자꾸 Segmentation fault 오류남. 기능 자체는 정상 동작

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef struct NODE {
    char name[100];
    char number[100];
    struct NODE *link;
}NODE;

NODE *prev, *next;

void add_number(NODE * p){
    char name[100];
    char number[100];
    printf("name: ");
    scanf("%s", name);
    printf("number: ");
    scanf("%s", number);
    strcpy(p->name, name);
    strcpy(p->number, number);
    printf("\ncomplete\n");
}

void search_number(NODE *list,NODE * p, int count){
    int i, true =0;
    char name[100];

    p = list;
    printf("what's name? : ");
    scanf("%s", name);
    printf("\n");

    for(i=0; i<count; i++){
        if(strcmp(name, p->name)==0){
            printf("%s\n", p->number);
            true = 1;
            break;
        }
        p = p->link;
    }
    if(true!=1)
        printf("Can't change. Check name.\n");
}

void modify_number(NODE* list,NODE * p, int count){
    int i;
    char name[100];
    char number[100];
    char cnum[100];
    int true = 0;
    p = list;
    printf("what's name? : ");
    scanf("%s", name);
    printf("\n");

    for(i=0; i<count; i++){
        if(strcmp(name, p->name)==0){
            printf("what number to modify: ");
            scanf("%s", cnum);
            strcpy(p->number, cnum);
            printf("\n%s change\n", p->number);
            true = 1;
            break;
            }
    p=p->link;
    }
    
    if(true != 1){
        printf("Can't change. Recheck name or number.\n");
    }
}

void print_list(){
    printf("Phone book menu using linked list\n");
    printf("===================================\n");
    printf("1.reset call book\n");
    printf("2.add number\n");
    printf("3.search number\n");
    printf("4.modify number\n");
    printf("===================================\n");
}

int get_num(){
    int num;
    printf("choice number: ");
    scanf("%d", &num);
    return num;
}


int main(void){
    NODE* list = NULL;
    NODE *p;
    int n, i, count=0;

    print_list();
    while((n = get_num())!=5){
        p = (NODE *)malloc(sizeof(NODE *));

        switch(n){
            case(1):{
                list = NULL; break;
                }
            case(2):{
                add_number(p);
                count++;
                break;
            }
            case(3):{
                p = list;
                search_number(list, p,count);
                break;
            }
            case(4):{
                modify_number(list, p,count);
                break;
            }
        }

        if(list == NULL){
            list = p;
        }
        else{
            prev->link = p;
        }

        prev = p;
    }

    printf("BYE");

    while(p!=NULL){
        next = p->link;
        free(p);
        p = next;
    }
    return 0;
}


//****************************************************************************//
// ./chap.17\p.7/test.c
/**
 * 영화에 대한 정보를 연결리스트로 저장하고 출력하는 프로그램
 **/

#include <stdio.h>

int main(void){

    return 0;
}


//****************************************************************************//
// ./ready_final\week10/ex1.c
#include <stdio.h>
#include <string.h>

int main(void){
	FILE* f;
	char file[20];
	char sword[20]; 
	char buffer[100]; 
	int count=0;

	printf("File name: ");
	scanf("%s", file);
	f = fopen(file, "r");
	printf("Search word: ");
	scanf("%s", sword);

	while (fgets(buffer, sizeof(buffer), f)){
		count++;
		if( strstr(buffer,sword)){ 
			printf("search.txt:%d  %s\n", count, buffer);
		}
	
	}
	printf("\n");
	fclose(f);
	return 0;
}


//****************************************************************************//
// ./ready_final\week10/ex2.c
#include <stdio.h>
#define GET_MIN(x,y,z) (x>y?(y>z? z:y):(x>z?z:x))

int main(void){
	int a, b, c;

	printf("Input three integers.: ");
	scanf("%d %d %d", &a, &b, &c);
	printf("\nThe minimum value is %d.", GET_MIN(a,b,c));

	return 0;
}


//****************************************************************************//
// ./ready_final\week11/ex1.c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <string.h>

int main(void){

	FILE *f = fopen("text.txt", "w+");
	FILE *b = fopen("binary.txt", "wb");

	int i, random;

	srand(time(NULL));
	for(i=0; i<100; i++){
		random = rand();
		fprintf(f,"%d", random);
		fwrite(&random, sizeof(char), 1, b);
	}

	fclose(f);
	fclose(b);
	return 0;
}


//****************************************************************************//
// ./ready_final\week11/ex2.c
#include <stdio.h>

#define GET_BIT(value, pos) ( (value >> pos) & 0x01)
void display_bit(int value);


int main(void){
	int value;

	printf("Input an integer value: ");
	scanf("%d", &value);
	printf("Binary: ");
	display_bit(value);

	return 0;
}

void display_bit(int value) {
    int i;
    for(i=7 ; i>=0; i--) {
		if(GET_BIT(value, i)) 
			printf("1");
		else
			printf("0");

    }
    printf("\n");
}


//****************************************************************************//
// ./ready_final\week12/ex1.c
#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>
#include <string.h>

typedef struct BOOK {
	char title[50];
	char author[50];
	char publisher[50];
} BOOK;

BOOK library[10];


void add_record(BOOK library[], int count){
	char title[50];
	char author[50];
	char publisher[50];

	printf("Book name: ");
	scanf("%s", title);
	strcpy(library[count].title, title);

	printf("Author: ");
	scanf("%s", author);
	strcpy(library[count].author, author);

	printf("Publisher: ");
	scanf("%s", publisher);
	strcpy(library[count].publisher, publisher);

}

void menu(){
	printf("====================\n");
	printf("1. Add\n");
	printf("2. Print\n");
	printf("3. Search\n");
	printf("4. Exit\n");
	printf("====================\n");
}

int get_input(){
	int num;
	
	printf("Input an integer: ");
	scanf("%d", &num);
	return num;
}

void search_record(BOOK library[], int count){
	char title[50];
	int i;
	int found = 0;

	printf("Input a title: ");
	scanf("%s", &title);
	for(i = 0; i<count; i++){
		if(strcmp(title,library[i].title)==0){
			printf("Author: %s\n", library[i].author);
			printf("Publisher: %s\n", library[i].publisher);
			found = 1;
		}
	}
	if (found != 1)
		printf("No books found\n");
}

void print_record(BOOK libray[], int count){
	int i; 
	for(i=0; i<count; i++){
		printf("Title: %s\n", library[i].title);
		printf("Author: %s\n", library[i].author);
		printf("Publisher: %s\n", library[i].publisher);
		printf("\n");
	}
}

int main(void){
	int a;
	int count = 0;

	while(1){
		menu();
		a = get_input();
		switch (a){

			case 1: add_record(library, count);
					count ++;
					break;	
			
			case 2 : print_record(library, count);
					 break;

			case 3 : search_record(library ,count);
					 break;

			case 4 : printf("End of Program\n"); 
					break; 

			default : printf("숫자를 정확히 입력해주세요\n");
					

		}
		if(a == 4)
			break;
	}
	return 0;
}



//****************************************************************************//
// ./ready_final\week12/ex2.c
#define _CRT_SECURE_NO_WARNINGS 
#include <stdio.h>
#include <stdlib.h>  

char *get_word();

int main(void){
	char *c;
    c = get_word();
	printf("Word: %s\n", c);

	free(c);
	return 0;
}


char *get_word(){
	char *c;
	c = (char*)malloc(sizeof(char)*10);
	if(c == NULL){
		printf("메모리 할당 오류");
		exit(1);
	}

	printf("Input a word(10 characters maximum): ");
	gets(c);
	

	return c;
}


//****************************************************************************//
// ./ready_final\week13/ex1.c
#include <stdio.h>
#include <string.h>

#define IS_SPACE(c) (c==' ' || c=='\t' || c=='\n') ?  1: 0

int main(void){
	char n[100];
	int num=0;
	int i;

	printf("Input a stinrg: ");
	gets(n); 
	for(i=0; i<sizeof(n); i++){
		if(IS_SPACE(n[i]) == 1){ 	
			num += 1;
		}
		if(n[i] == NULL) 
			break;
	}

	printf("Number of spaces: %d\n", num);
	return 0;
}


//****************************************************************************//
// ./ready_final\week13/ex2.c
#include <stdio.h>
struct student {
    char name[10];
    int korean;
    int math;
    int english;
}s;

int main(void){
    FILE *f = fopen("score.txt", "r+");
    FILE *f1 = fopen("average.txt", "w+");
    double min = 0;

	while(!feof(f)){
	    fscanf(f, "%s %d %d %d\n", &s.name, &s.korean, &s.math, &s.english);
        min = ( s.korean + s.math + s.english )/3;
        fprintf(f1, "%s %.2f\n", s.name, min);
    }


    fclose(f);
    return 0;
}


//****************************************************************************//
// ./ready_final\week13/ex3.c
#include <stdio.h>
#include <stdlib.h>

typedef struct NODE {   
    struct NODE *link;    
    int num;             
}NODE;

void print_list(NODE *list);
int get_integer();
NODE *prev, *p, *next;

int main(void){
	NODE *list = NULL;
	int n;
	while(1){
		n = get_integer(); 
		if(n == -1)
			break; 
		p=(NODE*)malloc(sizeof(NODE)); 
        p->num=n; 
        if(list==NULL){ 
			list=p; 
		}
        else{		
			prev->link=p; 
		}
        p->link=NULL; 
        prev=p;
	}
	p=list;
	print_list(list);

	while(p!=NULL){
        next=p->link;
        free(p);
        p=next;
    }

	return 0;
}

void print_list(NODE* list){
	while(1){
    if(p==NULL){  
		printf("NULL\n");
        break;
	}
    printf("%d->",p->num);
    p=p->link;
    }
}

int get_integer(){
	int num;
	
	printf("Input a apositive integer(Exit -1): ");
	scanf("%d", &num);

	return num;
}



//****************************************************************************//
// ./ready_final\week8\ex1/ex1.c
// 입력하는 파일을 그대로 출력하는 프로그램
#include <stdio.h>

int main(void){
    
    int i=0;
    char buffer[100];
    FILE* f = fopen("ex1.c", "r+");

    while(!feof(f)){
        fgets(buffer, 100, f);
        printf("%d: %s", i, buffer);
        i++;
    }

    fclose(f);
    return 0;
}


//****************************************************************************//
// ./ready_final\week8\ex2/ex2.c
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


//****************************************************************************//
// ./ready_final\week9/ex1.c
#include <stdio.h>
#include <fcntl.h>
#define SIZE 20

int main(void){
	FILE* o;
	FILE* c;
	char f1[SIZE];
	char f2[SIZE];
	char buffer[1024];
	int count;

	printf("Original file name: ");
	scanf("%s",f1);
	printf("Copy file name: ");
	scanf("%s", f2);

	o = fopen(f1, "rb");
	c = fopen(f2, "ab");

	while((count=fread(buffer,sizeof(char),1024,o))>0){
		fwrite(buffer,sizeof(char), count, c);

	}

	if(count<=0)
		printf("Copy complete\n");

	fclose(o);
	fclose(c);
	return 0;
}


//****************************************************************************//
// ./ready_final\week9/ex2.c
#include <stdio.h>
#include <string.h>

int main(void){

	FILE* t;
	char file[20]; 
	char input[100] = ""; 
	char result[200] = ""; 

	printf("Input file name: ");
	scanf("%s", file);

	while(1){
	
		gets(input);

		strcat(result, input);
		strcat(result, "\n");

		if(strcmp(input, "end") == 0)
			break;

	}
	
	t = fopen(file, "w");

	fputs(result, t);

	fclose(t);
	return 0;
}


//****************************************************************************//
