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
