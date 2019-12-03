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
