#include <stdio.h>

int main(void){
    int i, j, how=0;
    int list[10]={0,}, numlist[42]={0,}, num;

    for(i=0; i<10; i++){
        scanf("%d", &list[i]);
        numlist[list[i]%42]++;
    }

    for(i=0; i<42; i++){
        if(numlist[i]>0)
            how++;
    }


    printf("%d", how);

    return 0;
}