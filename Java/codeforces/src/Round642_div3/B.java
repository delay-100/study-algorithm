package Round642_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int result = 0;
			int change = 0;
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				a.add(input.nextInt());
			}

			for (int j = 0; j < n; j++) {
				b.add(input.nextInt());
			}
			Collections.sort(a);
			Collections.sort(b, Collections.reverseOrder());

			for (int j = 0; j < k; j++) {
				for (int p = 0; p < b.size(); p++) {
					if (a.get(j) < b.get(p)) {
						a.set(j, b.get(p));
						b.remove(p);
						change++;
						break;
					}
				}
				if (change == k)
					break;
			}

			for (int j = 0; j < n; j++)
				result += a.get(j);

			System.out.println(result);
		}

		input.close();
	}
}
