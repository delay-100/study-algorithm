package Round615_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long n = input.nextLong();
			long[] list = {1,1,1};
			long m = 1;
			int temp = 0;
			for (long j = 2; j < Math.sqrt(n); j++) {
				if (n % j == 0) {
					list[temp] = j;
					n /= list[temp];
					temp++;
					if (temp == 1)
						m = n;
					if (temp == 2)
						break;
				}
			}
			list[2] = m / list[1];

			if (list[0] != 1 && list[1] != 1 && list[2] != 1 && list[1] != list[2]) {
				System.out.println("YES");
				System.out.println(list[0] + " " + list[1] + " " + list[2]);

			} else {
				System.out.println("NO");
			}
		}

		input.close();
	}
}
