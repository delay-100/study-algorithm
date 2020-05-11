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