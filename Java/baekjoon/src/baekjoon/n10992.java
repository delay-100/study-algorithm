package baekjoon;

import java.util.Scanner;

public class n10992 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		for (int i = 0; i < a; i++) {
			if (i == a - 1)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		a--;
		for (int i = 0; i < a; i++) {
			if (i == a - 1) {
				for (int k = 0; k < 2 * a + 1; k++)
					System.out.print("*");
			} else {
				for (int j = 0; j < a - i - 1; j++)
					System.out.print(" ");
				System.out.print("*");
				for (int j = 0; j < 2 * i + 1; j++)
					System.out.print(" ");
				System.out.println("*");

			}
		}

		input.close();
	}
}
