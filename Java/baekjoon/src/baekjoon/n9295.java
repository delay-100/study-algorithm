package baekjoon;

import java.util.Scanner;

public class n9295 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			System.out.println("Case "+(i+1)+": "+(a+b));
		}

		input.close();
	}
}
