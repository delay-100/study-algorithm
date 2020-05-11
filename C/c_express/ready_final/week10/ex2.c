#include <stdio.h>
#define GET_MIN(x,y,z) (x>y?(y>z? z:y):(x>z?z:x))

int main(void){
	int a, b, c;

	printf("Input three integers.: ");
	scanf("%d %d %d", &a, &b, &c);
	printf("\nThe minimum value is %d.", GET_MIN(a,b,c));

	return 0;
}