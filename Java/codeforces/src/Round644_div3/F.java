package Round644_div3;

import java.util.Arrays;
import java.util.Scanner;

public class F {
	static int n, m;
	static char[][] list;

	public static boolean check() {

		for (int j = 0; j < n; j++) {
			int count = 0;
			for (int k = 0; k < m; k++) {
				if (list[j][k] != list[n][k]) {
					count++;
				}
			}
			if (count > 1) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < t; i++) {
			n = input.nextInt();
			m = input.nextInt();

			list = new char[n + 1][];

			for (int j = 0; j < n; j++)
				list[j] = input.nextLine().toCharArray();
			list[n] = Arrays.copyOf(list[0], m);
			if (check()) {
				sb.append(list[n]);
			}
			String s = "-1";
			out: for (int j = 0; j < m; j++) {
				for (int k = 1; k < n; k++) {
					list[n][i] = list[k][j];
					if (check()) {
						s = list[n].toString();
						break out;
					}
				}
				list[n][j] = list[0][j];
			}
			sb.append(s);
		}
		System.out.println(sb);
		input.close();
	}
}
