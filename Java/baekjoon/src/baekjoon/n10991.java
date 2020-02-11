package baekjoon;

import java.util.Scanner;

public class n10991 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int temp = 0;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k < 2 * i + 1; k++) {
				if (temp == 0) {
					System.out.print("*");
					temp = 1;
				} else if (temp == 1) {
					System.out.print(" ");
					temp = 0;
				}
			}
			temp = 0;
			System.out.println();
		}

		input.close();
	}

}
