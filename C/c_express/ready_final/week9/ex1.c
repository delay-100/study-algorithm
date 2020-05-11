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