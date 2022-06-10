package week3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int c = input.nextInt();

		for (int i = 0; i < c; i++) {
			int n = input.nextInt() + 1;
			int p = input.nextInt();
			int up = 0;
			if (p % 2 == 1)
				up = p / 2 + 1;
			else
				up = p / 2;

			int[] h = new int[p];
			for (int j = 0; j < p; j++) {
				h[j] = input.nextInt();
			}
			int lostnum = 0;
			int week = 0;
			int weeknum = 0;
			ArrayList<String> list = new ArrayList<String>();
			for (int j = 1; j < n; j++) {
				int num = 0;
				if (weeknum == 7) {
					week++;
					weeknum = 0;
				}
				if ((j != 1 + 7 * week) && (j != 4 + 7 * week) && (j != 7 + 7 * week)) {
					for (int k = 0; k < p; k++) {
						if (j % h[k] == 0) {
							num++;
						}
					}
					if (up <= num) {
						lostnum++;
						if (j == 2 + 7 * week) {
							list.add("Mon: " + j);
						} else if (j == 3 + 7 * week) {
							list.add("Tue: " + j);
						} else if (j == 5 + 7 * week) {
							list.add("Thu: " + j);
						} else if (j == 6 + 7 * week) {
							list.add("Fri: " + j);
						}

					}
				}
				weeknum++;
			}
			System.out.println("Lost: " + lostnum);
			for (int j = 0; j < list.size(); j++)
				System.out.println(list.get(j));
			System.out.println();
		}

		input.close();
	}
}
