// 학생들의 교과목 성적이 저장되어 있는 텍스트 파일을 읽어서
// 성적의 평균을 구하여 파일에 쓰는 프로그램
// 평균은 소수점 2자리까지 나타냄

#include <stdio.h>

struct student {
    char name[10];
    int korean;
    int math;
    int english;
}s;

int main(void){
    FILE *f = fopen("student.txt", "r");
    FILE *f1 = fopen("studentmin.txt", "w");
    int min = 0;

    fprintf(f1, "name min\n");
    fscanf(f, "%s %s %s %s\n", s.name, &s.korean, &s.math, &s.english);
    while(0 < fscanf(f, "%s %d %d %d\n", &s.name, &s.korean, &s.math, &s.english)){
        min = ( s.korean + s.math + s.english )/3;
        fprintf(f1, "%s %d\n", s.name, min);
    }


    fclose(f);
    return 0;
}