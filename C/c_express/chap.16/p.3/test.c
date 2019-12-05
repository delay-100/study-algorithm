/**
 * 배열 원소의 값을 모두 지정된 값으로 초기화하는 ARRAY_INIT(array, size, value)를 작성하여 테스트
 **/

#include <stdio.h>
#define SIZE 10
#define ARRAY_INIT(array,size,value) \
        int i; \
        for(i =0; i<size; i++) { \
            array[i] = value; \
        } 

int main(void){
    char array[SIZE];
    int j;
    ARRAY_INIT(array, SIZE, 0);
    printf("[ ");
    for(j = 0; j<SIZE; j++)
        printf("%d ", array[j]);
    printf("]");
    return 0;
}