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