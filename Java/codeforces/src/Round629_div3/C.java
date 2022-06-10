package Round629_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String x = input.next();
			String[] c = x.split("");

			String a = "1";
			String b = "1";

			int one = 0;

			for (int j = 1; j < n; j++) {
				if (one == 0) {
					if (c[j].equals("1")) {
						one++;
						a += "1";
						b += "0";
					} else if (c[j].equals("2")) {
						a += "1";
						b += "1";
					}
				} else if (one == 1) {
					if (c[j].equals("1")) {
						a += "0";
						b += "1";
					} else if (c[j].equals("2")) {
						a += "0";
						b += "2";
					}
				}
				if (c[j].equals("0")) {
					a += "0";
					b += "0";
				}
			}
			System.out.println(a);
			System.out.println(b);
		}

		input.close();

	}
}
