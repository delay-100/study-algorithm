package Round667_div3;

import java.util.Scanner;

public class B {
	public static long gozm(long a, long b, long x, long y, long n, long m, long z) {
		if (n >= z) {
			n -= z;
			b = y;
		} else {
			b -= n;
			n = 0;
		}
		if (n >= m) {
			n -= m;
			a = x;
		} else {
			a -= n;
			n = 0;
		}
		return a * b;
	}

	public static long gomz(long a, long b, long x, long y, long n, long m, long z) {
		if (n >= m) {
			n -= m;
			a = x;
		} else {
			a -= n;
			n = 0;
		}
		if (n >= z) {
			n -= z;
			b = y;
		} else {
			b -= n;
			n = 0;
		}
		return a * b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long x = input.nextLong();
			long y = input.nextLong();
			long n = input.nextLong();

			long m = a - x;
			long z = b - y;

			long temp = gozm(a, b, x, y, n, m, z);

			long temp2 = gomz(a, b, x, y, n, m, z);

			if (temp2 < temp)
				System.out.println(temp2);
			else
				System.out.println(temp);

		}

		input.close();
	}
}
