package Round661_div3;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = input.nextInt();
			}
			Arrays.sort(a);
			boolean istrue = true;
			if (n != 1) {
				for (int j = 0; j < n - 1; j++) {
					if ((a[j] == a[j + 1]) || (a[j + 1] == a[j] + 1)) {
//						System.out.println("a[j]"+a[j]);
//						System.out.println("a[j+1]"+a[j+1]);					
					}
					else
						istrue = false;
				}
			}
			if (istrue) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
		input.close();
	}
}
