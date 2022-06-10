package week10;

import java.util.Scanner;

public class pre2 {

	static int[][] DP;
	static int[] list;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int q = 0; q < t; q++) {
			input.nextLine();
			int N = input.nextInt();
			int W = 0;
			list = new int[N + 1];

			for (int i = 1; i <= N; i++) {
				list[i] = input.nextInt();
				W += list[i];
			}

			DP = new int[N + 1][W + 1];
			DP[0][0] = 1;

			for (int i = 1; i <= N; i++) {
				for (int j = N; j > 0; j--) {
					for (int w = W; w >= list[i]; w--) {
						if (DP[j - 1][w - list[i]] == 1) {
							DP[j][w] = DP[j - 1][w - list[i]];
						}
					}
				}
			}

			int result = list[0];
			int min = 999999999;
			for (int j = 1; j <= N; j++) {
				for (int w = 0; w <= W; w++) {
					if (DP[j][w] == 1 && j == N / 2) {
						int a = w;
						int b = W - w;
						if (b > a) {
							int tmp = b;
							b = a;
							a = tmp;
						}
						if (a - b < min && b != 0) {
							min = a - b;
							result = a;
						}
					}
				}
			}
			if (result > W - result)
				System.out.println((W - result) + " " + result);
			else
				System.out.println(result + " " + (W - result));
			System.out.println();
		}
		input.close();

	}
}
