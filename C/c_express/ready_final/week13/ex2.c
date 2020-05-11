#include <stdio.h>
struct student {
    char name[10];
    int korean;
    int math;
    int english;
}s;

int main(void){
    FILE *f = fopen("score.txt", "r+");
    FILE *f1 = fopen("average.txt", "w+");
    double min = 0;

	while(!feof(f)){
	    fscanf(f, "%s %d %d %d\n", &s.name, &s.korean, &s.math, &s.english);
        min = ( s.korean + s.math + s.english )/3;
        fprintf(f1, "%s %.2f\n", s.name, min);
    }


    fclose(f);
    return 0;
}