package week9;

import java.util.Scanner;

public class p3 {
	static int[][] list;
	static int[][] ans;
	static int exitX;
	static int exitY;
	static int n, m;
	static int[][] list2;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		m = input.nextInt();

		list = new int[n][m];
		ans = new int[n][m];

		list2 = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans[i][j] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				list2[i][j] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				list[i][j] = input.nextInt();
				if (list[i][j] == 2) {
					exitX = i;
					exitY = j;
				}
			}
		}
		exitfind(0, 0);

		input.close();
	}

	static void exitfind(int i, int j) {
		ans[i][j] = 0;
		list2[i][j] = 1;

		if (i == exitX && j == exitY) {

			int num = 0;
			for (int k = 0; k < n; k++) {
				for (int q = 0; q < m; q++) {
					if (list2[k][q] >= 1) {
						num++;
					}
					if (k == exitX && q == exitY) {
						System.out.print(2 + " ");
					} else
						System.out.print(list2[k][q] + " ");

				}
				System.out.println();
			}

			System.out.println(num + "\n");
		}

		// 우측
		if ((j + 1 < m) && (ans[i][j + 1] == 1) && (list[i][j + 1] >= 1)) {
			exitfind(i, j + 1);
		}

		// 하단
		if ((i + 1 < n) && (ans[i + 1][j] == 1) && (list[i + 1][j] >= 1)) {
			exitfind(i + 1, j);
		}

		// 좌측
		if ((j - 1 >= 0) && (ans[i][j - 1] == 1) && (list[i][j - 1] >= 1)) {
			exitfind(i, j - 1);
		}

		// 상단
		if ((i - 1 >= 0) && (ans[i - 1][j] == 1) && (list[i - 1][j] >= 1)) {
			exitfind(i - 1, j);
		}

		ans[i][j] = 1;
			list2[i][j] = 0;
		}
	

}
