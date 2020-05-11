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