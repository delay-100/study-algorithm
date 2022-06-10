package week3;

import java.io.IOException;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();
		String s = input.nextLine();
		String[] c = s.split(" ");
		String[] space = new String[n];

		for (int i = 0; i < n; i++) {
			space[i] = "#";
		}

		for (int i = 0; i < c.length; i++) {
			if ((c[i].charAt(0) >= 65) && (c[i].charAt(0) <= 90)) {
				for (int j = 0; j < n; j++) {
					if (space[j].equals("#")) {
						space[j] = c[i];
						break;
					}
				}
			} else if (c[i].charAt(0) == '*') {
				int index = 0;
				for (int j = 0; j < n; j++) {
					if (space[j].charAt(0) >= 65 && (space[j].charAt(0) <= 90)) {
						index = j;
						break;
					}
				}
				for (int j = 0; j < n; j++) {
					if ((space[j].charAt(0) >= 65) && (space[j].charAt(0) <= 90)
							&& (space[j].charAt(0) < space[index].charAt(0))) {
						index = j;
					}
				}
				space[index] = "#";

			}
		}


		for (int i = 0; i < n - 1; i++) {
			System.out.print(space[i] + " ");
		}
		System.out.println(space[n - 1]);
		input.close();
	}
}
