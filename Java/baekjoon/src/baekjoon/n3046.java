package baekjoon;

import java.util.Scanner;

public class n3046 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = 0;
		
		c = (b*2)-a;
		
		System.out.println(c);
		
		input.close();
	}
}
