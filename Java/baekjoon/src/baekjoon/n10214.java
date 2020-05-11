package baekjoon;

import java.util.Scanner;

public class n10214 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int ynum = 0;
		int knum = 0;

		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			ynum += a;
			knum += b;

			if (ynum > knum)
				System.out.println("Yonsei");
			else if (ynum < knum)
				System.out.println("Korea");
			else
				System.out.println("Draw");
		}

		input.close();
	}

}
