#include<stdio.h>

int main(void){

    int hour, minute;

    scanf("%d %d", &hour, &minute);

    if(minute >= 0 && minute < 45 ){
        if(hour==0)
            hour = 23;
        else
            hour -= 1;
        minute = 60-(45-minute);
    }
    else if(minute >=45 && minute<=59){
        minute = minute - 45;
    }
    
    printf("%d %d", hour, minute);
    
    return 0;
}