package Round653_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int count = 0;

			while (n % 3 == 0) {
				if (n % 6 == 0) {
					n /= 6;
					count++;
				} else {
					n = n / 3; // n= n/6*2;
					count+=2;
				}
			}
			if(n==1)
				System.out.println(count);
			else
				System.out.println(-1);
		}

		input.close();
	}
}
