#include <stdio.h>

#define GET_BIT(value, pos) ( (value >> pos) & 0x01)
void display_bit(int value);


int main(void){
	int value;

	printf("Input an integer value: ");
	scanf("%d", &value);
	printf("Binary: ");
	display_bit(value);

	return 0;
}

void display_bit(int value) {
    int i;
    for(i=7 ; i>=0; i--) {
		if(GET_BIT(value, i)) 
			printf("1");
		else
			printf("0");

    }
    printf("\n");
}