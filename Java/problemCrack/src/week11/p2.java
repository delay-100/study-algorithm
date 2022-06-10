package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2 {
	static int[][] list;
	static int[][] ans;
	static int exitX;
	static int exitY;
	static int n;
	static int[][] list2;
	static ArrayList<Integer> numa;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		n = input.nextInt();

		list = new int[n][n];
		ans = new int[n][n];
		numa = new ArrayList<Integer>();

		list2 = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				ans[i][j] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				list2[i][j] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				list[i][j] = input.nextInt();
				if (i==n-1&&j==n-1) {
					exitX = i;
					exitY = j;
				}
			}
		}
		exitfind(0, 0);

		Collections.sort(numa);
		System.out.println(numa.get(0));
		input.close();
	}

	static void exitfind(int i, int j) {
		boolean istrue = false;
		ans[i][j] = 0;
		list2[i][j] = 1;

		if (i == exitX && j == exitY) {

			int num = 0;
			for (int k = 0; k < n; k++) {
				for (int q = 0; q < n; q++) {
					if (list2[k][q] >= 1) {
						num++;
					}
					

				}
			}
			numa.add(num);
		}

		// 우측
		if ((j + 1 < n) && (ans[i][j + 1] == 1) && (list[i][j + 1] >= 1)) {
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
		istrue = false;
		if (!istrue) {
			list2[i][j] = 0;
		}
	}

}
