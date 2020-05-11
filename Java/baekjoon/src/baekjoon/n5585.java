package baekjoon;

import java.util.Scanner;

public class n5585 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pay = input.nextInt();
		int account = 1000 - pay;
		int num = 0;

		int[] list = { 500, 100, 50, 10, 5, 1 };

		for (int i = 0; i < 6; i++) {
			if (account == 0)
				break;
			if (account/list[i] > 0) {
				num += account / list[i];
				account -= (account/list[i]) * list[i];
			}

		}
		System.out.println(num);

		input.close();
	}
}
