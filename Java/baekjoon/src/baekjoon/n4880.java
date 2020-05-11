package baekjoon;

import java.util.Scanner;

public class n4880 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			if (b - a == c - b) {
				System.out.println("AP " + (c + (b - a)));
			} else if (b / a == c / b) {
				System.out.println("GP " + (c * (b / a)));
			}
		}
		input.close();
	}
}
