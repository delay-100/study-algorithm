package Round89_div2;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int x = input.nextInt();
			int m = input.nextInt();

			int temp = x;
			int temp2 = x;

			for (int j = 0; j < m; j++) {
				int l = input.nextInt();
				int r = input.nextInt();

				if(!(temp2<l || temp>r)) {
					if (l < temp)
						temp = l;
					if (temp2 < r)
						temp2 = r;
				}

			}

			System.out.println(temp2 - temp + 1);
		}

		input.close();
	}
}
