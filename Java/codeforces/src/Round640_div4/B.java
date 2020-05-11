package Round640_div4;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			if (a >= b) {
				int[] list = new int[b];

				for (int j = 0; j < b; j++)
					list[j]++;

				int temp = a - b;
				while (true) {
					if (temp == 1) {
						System.out.println("NO");
						break;
					}
					if (temp % 2 == 0) {
						list[0] += temp;
						break;
					} else {
						for (int j = 0; j < b; j++)
							list[j]++;
						temp -= b;
					}
				}

				if (temp != 1) {
					System.out.println("YES");
					for (int k = 0; k < b; k++) {
						System.out.print(list[k] + " ");
					}
					System.out.println();
				}
			}
			else {
				System.out.println("NO");
			}
		}

		input.close();
	}

}