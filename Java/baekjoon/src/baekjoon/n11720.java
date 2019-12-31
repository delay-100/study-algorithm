package baekjoon;

import java.util.Scanner;

public class n11720 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, sum=0;
		n = input.nextInt();

		String s = input.next();
		for(int i=0; i<n; i++) {
			sum += s.charAt(i)-'0';
		}
		System.out.println(sum);
		input.close();
	}
}
