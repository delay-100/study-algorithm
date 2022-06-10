package Round660_div2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();

			if (n >= 31) {
				int temp = n - 30;
				System.out.println("YES");
				if (temp == 6) {
					System.out.println("5 6 10 15");
				}else if(temp==10) {
					System.out.println("5 6 14 15");
				}
				else if (temp == 14) {
					System.out.println("6 7 10 21");
				} else
					System.out.println("6 10 14 " + temp);
			} else
				System.out.println("NO");

		}
		input.close();
	}
}
