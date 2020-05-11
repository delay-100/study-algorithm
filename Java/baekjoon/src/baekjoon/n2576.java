package baekjoon;

import java.util.Scanner;

public class n2576 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = new int[7];
		int sum = 0;
		int min = 100;

		for (int i = 0; i < 7; i++) {
			list[i] = input.nextInt();
			if (list[i] % 2 != 0) {
				sum += list[i];
				if (min > list[i])
					min = list[i];
			}
		}

		if (sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}

		input.close();
	}
}
