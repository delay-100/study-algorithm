package Round617_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int s = input.nextInt();
			int x = s;
			int b = -1;

			while (true) {
				if (b == 0)
					break;
				else {
					if ((b = x / 10) > 0) {
						x -= b * 10;
						x += b;
						s += b;
					}
				}
			}
			System.out.println(s);

		}

		input.close();
	}
}
