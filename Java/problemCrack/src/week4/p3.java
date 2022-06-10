package week4;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int q = 0; q < n; q++) {
			input.nextLine();
			int l = input.nextInt();
			int r = input.nextInt();
			char[][] c = new char[l][r];
			char[][] c1 = new char[l][r];
			for (int i = 0; i < l; i++) {
				String temp = input.next();
				c[i] = temp.toCharArray();
				c1[i] = temp.toCharArray();
			}
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					if (97 <= c1[i][j] && c1[i][j] <= 122) {
						c1[i][j] = (char) (c1[i][j] - 32);
					}
				}
			}
			char[] teemo = { 'T', 'E', 'E', 'M', 'O' };
			int[][] zz = new int[l][r];
			int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
			int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					for (int k = 0; k < 8; k++) {
						int tnum = 0;
						for (int h = 0; h < 5; h++) {
							int nx = i + dx[k] * h;
							int ny = j + dy[k] * h;
							if (nx >= 0 && ny >= 0 && nx <= l - 1 && ny <= r - 1 && teemo[h] == c1[nx][ny]) {
								tnum++;
							}
						}
						if (tnum >= 4) {
							for (int h = 0; h < 5; h++) {
								int nx = i + dx[k] * h;
								int ny = j + dy[k] * h;
								zz[nx][ny] = 1;
							}
						}
					}
				}
			}
			if(q>0)
				System.out.println();
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < r; j++) {
					if (zz[i][j] == 1) {
						System.out.print("#");
					} else
						System.out.print(c[i][j]);
				}
				System.out.println();
			}
		}

		input.close();
	}
}
