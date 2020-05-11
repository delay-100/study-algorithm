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
        printf("Check name.\n");
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