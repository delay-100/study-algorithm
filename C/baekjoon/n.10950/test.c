#include <stdio.h>

int main(void){

    int num, a, b, i=0;

    scanf("%d", &num);
    int c[num];

    for(i=0; i<num; i++){
        scanf("%d %d\n", &a, &b);
        c[i] = a+b;
    }
    for(i=0; i<num; i++){
        printf("%d\n", c[i]);
    }
    return 0;
}