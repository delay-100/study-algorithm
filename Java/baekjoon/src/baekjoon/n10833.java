package baekjoon;

import java.util.Scanner;

public class n10833 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			int ap = input.nextInt();
			int num = input.nextInt();
			
			while(true) {
				if((num - ap) < ap && (num-ap)>0) {
					sum += (num-ap);
					break;
				}			
				else if((num - ap) < ap && (num-ap)<0) {
					sum += num;
					break;
				}
				num -= ap;
			}
			
			
		}
		
		System.out.println(sum);
		
		input.close();
	}
}
