package Round627_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			int istrue = 0;
			for (int j = 0; j < n; j++) {
				list[j] = input.nextInt();
			}
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if ((list[j] == list[k]) && (k - j > 1)) {
						istrue = 1;
					}
				}
			}
			if (istrue == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		input.close();
	}
}
