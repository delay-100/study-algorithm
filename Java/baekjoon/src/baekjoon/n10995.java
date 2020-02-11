package baekjoon;

import java.util.Scanner;

public class n10995 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a; j++) {
					System.out.print("* ");
				}
			}
			else {
				for (int j = 0; j < a; j++) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
		input.close();
	}
}
