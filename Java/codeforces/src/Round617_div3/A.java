package Round617_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			int even = 0, odd = 0;

			for (int j = 0; j < n; j++) {
				list[j] = input.nextInt();
				if (list[j] % 2 == 0)
					even++;
				else
					odd++;
			}

			if (odd == 0)
				System.out.println("NO");
			else if (even == 0) {
				if (odd % 2 == 0)
					System.out.println("NO");
				else
					System.out.println("YES");
			} else
				System.out.println("YES");
		}

		input.close();
	}
}
