package Round629_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();

			char[] list = new char[n];

			for (int j = 0; j < n; j++) {
				list[j] = 'a';
			}
			int b1 = n - 2;
			int num = 0;

			for (int j = 1; j < n; j++) {
				num += j; // num은 +1 +2 +3 +4 .. 인 등차수열
							// 1 3 6 10 15 
				if (num >= k)
					break;
				b1 -= 1;
			}
			
			int b2 = b1 + num - k +1;

			list[b1] = 'b';
			list[b2] = 'b';

			for (int j = 0; j < n; j++) {
				System.out.print(list[j]);
			}
			System.out.println();
		}

		input.close();
	}
}
