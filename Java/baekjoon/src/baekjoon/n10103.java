package baekjoon;

import java.util.Scanner;

public class n10103 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int anum = 100, bnum = 100;
		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			if (a == b)
				;
			else if (a < b)
				anum -= b;
			else
				bnum -= a;
		}

		System.out.println(anum);
		System.out.println(bnum);
		input.close();
	}
}
