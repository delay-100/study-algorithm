#include <stdio.h>

int main(void){

    int n, i, max=0;
    double sum=0.0;
    double list[10000];

    scanf("%d", &n);
    for(i=0; i<n; i++)
        scanf("%lf", &list[i]);

    for(i=0; i<n; i++){
        if(max==0)
            max = list[0];
        if(max < list[i])
            max = list[i];
    }

    for(i=0; i<n; i++){
        sum += ((list[i]/max)*100);
    }

    printf("%.2lf", sum/n);

    return 0;
}