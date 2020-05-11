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