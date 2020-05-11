package baekjoon;

import java.util.Scanner;

public class n10872 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int num = 1;

		for (int i = 0; i < a; i++) {
			num *= (a - i);
		}
		System.out.println(num);

		input.close();
	}
}
