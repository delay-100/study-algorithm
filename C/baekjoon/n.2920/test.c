#include <stdio.h>
#include <string.h>

int main(void) {
	char c[16];
	int i;

	gets(c);


	if (strcmp(c, "1 2 3 4 5 6 7 8")==0)
		printf("ascending");
	else if (strcmp(c, "8 7 6 5 4 3 2 1")==0)
		printf("descending");
	else
		printf("mixed");

	return 0;
}