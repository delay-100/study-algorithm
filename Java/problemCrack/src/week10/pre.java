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

		// ��� �����ڿ� ���ؼ�
		for (int i = 1; i <= N; i++) {
			int W_i = list[i]; // 100
			DP[i][W_i] = 1;
			
			System.out.println(i);
			System.out.println(W_i);
			for (int w = 1; w <= W; w++) {// ���� �� �ִ� �������� �� ��
				if (w - W_i >= 0) {
					// ���� �����ڸ� �����ϰ� ������ w�� ���� �� �־��ٸ�
					if (DP[i - 1][w - W_i] > 0) {
						// ������ W_i�� ���� w + W_i�� ���� �� �ְ�, �� �����Ը� ���� ����� ����
						// w - W_i �����Ը� ���� ��� �� +1�̴�.
						DP[i][w] = DP[i][w - W_i] + 1;
						System.out.println(w - W_i);
					}
				}
			}

		}

		int result = 0;
		int min = 450;
		for (int w = 1; w < W; w++) { // ���� �� �ִ� ��� �����Կ� ����
			if (DP[N][w] == N / 2) {
				System.out.println("w=" + w);
				// w�� total -w �������� ���̰� ���� ���� ���� ����
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
