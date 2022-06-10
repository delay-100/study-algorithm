package Round667_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();

			if (b > a) {
				long temp = b;
				b = a;
				a = temp;
			}
			a -= b;
			int z = 0;
			if(a%10>0) {
				z=1;
			}
			System.out.println(a / 10 + z);
		}

		input.close();
	}
}
