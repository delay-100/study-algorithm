package week10;

import java.util.Scanner;

public class pre {

	static int[][] DP;
	static int[] list;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt(); // 3
		int W = 0;
		list = new int[N + 1]; // 100 90 200

		for (int i = 1; i <= N; i++) {
			list[i] = input.nextInt();
			W += list[i];
		}

		DP = new int[N + 1][W + 1];

		// 모든 참가자에 대해서
		for (int i = 1; i <= N; i++) {
			int W_i = list[i]; // 100
			DP[i][W_i] = 1;
			
			System.out.println(i);
			System.out.println(W_i);
			for (int w = 1; w <= W; w++) {// 나올 수 있는 몸무게의 총 합
				if (w - W_i >= 0) {
					// 현재 참가자를 제외하고 몸무게 w를 만들 수 있었다면
					if (DP[i - 1][w - W_i] > 0) {
						// 몸무게 W_i를 더한 w + W_i도 만들 수 있고, 이 몸무게를 만든 사람의 수는
						// w - W_i 몸무게를 만든 사람 수 +1이다.
						DP[i][w] = DP[i][w - W_i] + 1;
						System.out.println(w - W_i);
					}
				}
			}

		}

		int result = 0;
		int min = 450;
		for (int w = 1; w < W; w++) { // 만들 수 있는 모든 몸무게에 대해
			if (DP[N][w] == N / 2) {
				System.out.println("w=" + w);
				// w와 total -w 몸무게의 차이가 가장 작은 것을 구함
				if (W - w < min) {
					min = W - w;
					result = w;
				}
			}
		}
		if (result > W - result)
			System.out.println((W - result) + " " + result);
		else
			System.out.println(result + " " + (W - result));

		input.close();

	}
}
