#include <stdio.h>

int main(void){

    int a,b,c,i, n=0, len;
    int list[10]={0,};

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    n = a * b * c;

    while(n>0){
        list[n%10]++;
        n=n/10;
    }

    for(i=0; i<10; i++){
        printf("%d\n",list[i]);
    }
    return 0;
}
