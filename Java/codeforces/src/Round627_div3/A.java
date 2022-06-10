package Round627_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			for (int j = 0; j < list.length; j++) {
				list[j] = input.nextInt();
			}
			int even = 0;
			int odd = 0;
			for (int j = 0; j < list.length; j++) {
				if (list[j] % 2 == 0)
					even++;
				else
					odd++;
			}
			if((n==even)||(n==odd))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		input.close();
	}
}
