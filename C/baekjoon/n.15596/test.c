#include <stdio.h>

long long sum(int *a, int n){
    long sum;
    int i;
    for(i=0; i<n; i++)
        sum += a[i];

    return sum;
}

int main(void){

    int n;
    scanf("%d", &n);
    long list[n];

    sum(list, n);

    return 0;
}
