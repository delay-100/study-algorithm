package baekjoon;

import java.util.Scanner;

public class n1712 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(b>=c)
			System.out.println(-1);
		else {
			
			System.out.println(a/(c-b)+1);
		}
		input.close();
	}
}
