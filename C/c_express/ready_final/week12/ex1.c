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
