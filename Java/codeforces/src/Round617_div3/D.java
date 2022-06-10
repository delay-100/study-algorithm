package Round617_div3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		long a = input.nextLong();
		long b = input.nextLong();
		long k = input.nextLong();
		long[] h = new long[n];

		for (int j = 0; j < n; j++) {
			h[j] = input.nextInt();
		}

		long c = a + b;

		for (int j = 0; j < n; j++) {
			long temp = h[j] % c;
			if (temp > 0)
				h[j] = temp;
			else
				h[j] = c;
		}

		Arrays.sort(h);

		int point = 0;
		for (int j = 0; j < n; j++) {
			h[j] -=a;
			long tmp = h[j]/a;
			
			if(h[j]%a>0) {
				tmp++;
			}
			if(tmp<=k) {
				point++;
				k-=tmp;
			}
			else
				break;
		}
		System.out.println(point);

		input.close();
	}

}
