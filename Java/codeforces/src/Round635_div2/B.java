package Round635_div2;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int q = input.nextInt();

		for (int i = 0; i < q; i++) {
			int x = input.nextInt();
			int n = input.nextInt();
			int m = input.nextInt();

			int tmp = 0;
			int temp = 0;

			while (true) {
				if ((x <= 0) || ((tmp == n) && (temp == m)))
					break;
				else {
					if (((x <=20)&& ((m > 0) && (temp < m))) || ((tmp == n) && ((m > 0) && (temp < m)))) {
						x -= 10;
						temp++;

					}
					else if ((n > 0) && (tmp < n)) {
						x = (x / 2) + 10;
						tmp++;
					}
				}
			}

			if (x <= 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		input.close();
	}
}
