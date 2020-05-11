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