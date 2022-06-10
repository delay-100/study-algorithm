package Round659_div2;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			int highindex = 0;
			int value = 0;

			for (int j = 0; j < n; j++) {
				a.add(input.nextInt());
				if (a.get(j) > value) {
					highindex = j;
					value = a.get(j);
				}
			}
			a.add(highindex, value);
			n++;
			String ws = "";
			char w = 'b';
			char q = 'a';
			for (int j = 0; j < n; j++) {
				if (a.get(j) == 0) {
					if (!ws.isEmpty()) {
						w = 'b';
					} else {
						w = 'c';
					}
					if (j + 1 != n && a.get(j + 1) > 0) {
						for (int k = 0; k < a.get(j+1); k++) {
							System.out.print(w);
							ws += w;
						}
					} else
						System.out.print(w);
				} else if (!ws.isEmpty() && a.get(j) > 0) {
					for (int k = 0; k < a.get(j); k++) {
						System.out.print(ws);
					}
				} else {
					for (int k = 0; k < a.get(j); k++) {
						System.out.print(q);
					}
				}
				System.out.println();
			}
		}

		input.close();
	}
}
