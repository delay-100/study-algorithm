package week6;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();
		int[][] home = new int[n][2];
		int[][] result = new int[m][2];
		int[] num = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++)
				home[i][j] = input.nextInt();
		}
		int min = 99999999;
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				num[i] += Math.abs(home[j][0] - home[i][0]) + Math.abs(home[j][1] - home[i][1]);
			}
			if (min > num[i]) {
				min = num[i];
				index = i;
				result[0][0] = home[i][0];
				result[0][1] = home[i][1];
			}
		}
		int[] temp = new int[n];
		for (int j = 0; j < n; j++) {
			temp[j] = Math.abs(home[j][0] - home[index][0]) + Math.abs(home[j][1] - home[index][1]);
			if (j == index)
				temp[j] = 99999999;
		}
		int[] index2 = new int[n];
		for (int i = 0; i < n; i++) {
			index2[i] = i;
		}
		int j;
		for (int i = 1; i < n; i++) {
			j = i;
			while ((j > 0) && (temp[j] < temp[j - 1])) {
				int tempp = temp[j];
				temp[j] = temp[j - 1];
				temp[j - 1] = tempp;
				int indeex = index2[j];
				index2[j] = index2[j - 1];
				index2[j - 1] = indeex;
				j = j - 1;
			}

		}
		int k = 0;
		for (int i = 1; i < m; i++) {
			result[i][0] = home[index2[k]][0];
			result[i][1] = home[index2[k]][1];
			k++;
		}
		System.out.println(min);

		for (int i = 0; i < m; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(result[i][j]);
				if (j == 0)
					System.out.print(" ");
			}
			System.out.println();
		}

		input.close();
	}
}
