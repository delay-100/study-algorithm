#include <stdio.h> //전처리기 지시자0
#define DEBUG 2
#define LEVEL 3
#define POWER_TYPE 0 // POWER_TYPE라는 매크로 정의

#if POWER_TYPE == 0
    double power(int x, int y){
        double result = 1.0;
        int i;

        for(i = 0; i<y; i++){
            printf("result = %d\n", (int)result);
            result *=x;
        }
        return result;
    }
#elif POWER_TYPE ==1
    double power(int x, int y){
        double result = 1.0;
        int i;

        for(i=0; i<y; i++){
            #if 0
            printf("result=%f\n",result); 문장 1
            #endif
            printf("line = %d, result= %f\n",__LINE__, result);
            result *= x;
        }

        return result;
    }
#endif

int main(void){

    
    #ifdef DEBUG //(a) DEBUG가 정의되어 있는 경우에만 화면 출력이 나오도록 함
        power(2,11);
    #endif

    #if (DEBUG == 2) // (b) DEBUG가 2일 경우에만 화면 출력이 나오도록 함
        power(2,11);
    #endif

    #if (DEBUG ==2 && LEVEL == 3) //(c) DEBUG가 2이고 LEVEL이 3인 경우에만 화면 출력이 나오도록 수정 함
        power(2, 11);
    #endif

    return 0;
}