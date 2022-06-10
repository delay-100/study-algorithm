package Round661_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			long[] a = new long[n];
			long[] b = new long[n];

			long amin = 1000000000;
			long bmin = 1000000000;

			for (int j = 0; j < n; j++) {
				a[j] = input.nextLong();
				if (amin > a[j]) {
					amin = a[j];
				}
			}
			for (int j = 0; j < n; j++) {
				b[j] = input.nextLong();
				if (bmin > b[j]) {
					bmin = b[j];
				}
			}
			long sum = 0;
			for (int j = 0; j < n; j++) {

				long atemp = a[j] - amin;
				long btemp = b[j] - bmin;

				if (atemp < btemp) {
					long ctemp = atemp;
					atemp = btemp;
					btemp = ctemp;
				}
				sum += atemp;

			}

			System.out.println(sum);
		}
		input.close();
	}
}
