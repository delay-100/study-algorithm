package baekjoon;

import java.util.Scanner;

public class n15727 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int temp = 0;
		int time = 0;
		
		while(temp==0) {
			if(a-5>=0) {
				a = a -5;
				time++;
			}
			else if(5>a&&a>0) {
				time++;
				a =0;
			}
			else
				temp = 1;
		}
		System.out.println(time);
		
		input.close();
	}
}
