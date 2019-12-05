/** 원기둥의 부피는 파이(3.14...)*(반지름)^2*높이 이다.
 * 사용자로부터 반지름과 높이를 받아서 원기둥의 부피를 구하는 프로그램
 * 파이는 단순 매크로로 정의한다. 원기둥의 부피를 구하는 공식은 함수 매크로로 정의한다.
 **/

#include <stdio.h>
#define M_PI 3.141592
#define VALUME(r,h) (M_PI)*(r)*(r)*(h)

int main(void){
    int r,h;

    printf("Cylinder volume calculator\n");
    printf("put radius: ");
    scanf("%d", &r);
    printf("\nput height: ");
    scanf("%d", &h);
    printf("\nvolume: %f", VALUME(r,h));

    return 0;
}