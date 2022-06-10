package week14;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int M = input.nextInt();
		int K = input.nextInt();

		int[] list = new int[N + 1];
		int[] dp = new int[N + 1];

		for (int i = 0; i < K; i++) {
			int n = input.nextInt();
			list[n] = -1;
		}
		int result = 0;
		dp[0] = 1;

		if (M == 1) {
			result = 1;
		} else {
			for (int i = 0; i < N + 1; i++) {
				for (int j = 1; j < M + 1; j++) {
					if (i + j < N + 1) {
						if (list[i + j] != -1) {
							dp[i + j] += dp[i];
						}
					}
				}
			}
			result = dp[N];
		}
		System.out.println(result);
		input.close();
	}
}
