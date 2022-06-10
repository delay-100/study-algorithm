package Round642_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long n = input.nextInt();
			long result = 0;
			long temp = 0;
			long num = 0;
			long k = 2;

			if (n == 1)
				System.out.println(0);
			else {
				for (long j = 3; j <= n; j = j + 2) {
					if (j == 3) {
						result = j * j - 1;
					} else {
						num = (j * j - temp * temp) * k;
						k++;
						result += num;
					}
					temp = j;
				}
				System.out.println(result);
			}

		}

		input.close();
	}
}
