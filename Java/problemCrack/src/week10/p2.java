package week10;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = (int) Math.pow(2, n * 2) - 1; i > (int) Math.pow(2, n * 2 - 1); i--) {
			String bin = Integer.toBinaryString(i);
			char[] list2 = bin.toCharArray();
			int b = 0; // b 가 1
			int c = 0; // c가 0
			int num = 0;
			boolean istrue = true;

			int f_b = 0;
			for (int j = 0; j < n * 2; j++) {

				if (list2[j] == '1') {
					b++;
					num++;
					f_b++;
				} else { // 0이 나온 경우
					b--;
					c++;
					if (f_b - 1 < 0) {
						istrue = false;
						break;
					} else { // f_b>f_c
						f_b -= 1;
					}
				}
			}
			if (!istrue)
				continue;
			else {
				if (b == 0 && c == num) {
					for (int j = 0; j < n * 2; j++) {
						if (list2[j] == '1')
							System.out.print('b');
						else
							System.out.print('c');
					}
					if (i != (int) Math.pow(2, n * 2 - 1) + 1)
						System.out.println();
				}

			}

		}

		input.close();
	}
}
