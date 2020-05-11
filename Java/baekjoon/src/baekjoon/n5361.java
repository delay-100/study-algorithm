package baekjoon;

import java.util.Scanner;

public class n5361 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();

		for(int i =0; i<n; i++) {
			double sum = 0;
			
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();
			int e = input.nextInt();
			
			sum = (a*350.34) + (b*230.90) + (c*190.55) + (d*125.30) +(e*180.90);
			System.out.println("$"+String.format("%.2f", sum));
		}
		
		input.close();
	}
}
