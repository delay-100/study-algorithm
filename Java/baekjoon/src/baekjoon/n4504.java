package baekjoon;

import java.util.Scanner;

public class n4504 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		while (true) {
			int n = input.nextInt();

			if (n == 0)
				break;

			if (n % a == 0)
				System.out.println(n + " is a multiple of " + a + ".");
			else
				System.out.println(n + " is NOT a multiple of " + a + ".");

		}
		input.close();
	}

}
