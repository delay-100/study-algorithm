#include <stdio.h>

int main(void) {
	int i, count = 9, temp=0;
	int num, max = 0;

	for (i = 0; i < count; i++) {
		scanf("%d", &num);

		if (max == 0) {
			max = num;
			temp = 1;
		}

		if (max < num) {
			max = num;
			temp = i + 1;
		}

	}

	printf("%d\n%d", max, temp);
	return 0;
}