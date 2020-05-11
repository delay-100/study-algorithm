package baekjoon;

import java.util.Scanner;

public class n2965 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int count = 0;

		while (true) {
			if ((a + 1 == b) && (b + 1 == c))
				break;
			if ((c - b) > (b - a)) {
				a = b;
				b = c - 1;
				count++;
			} else if ((c - b) < (b - a)) {
				c = b;
				b = a + 1;
				count++;
			} else {
				a = b;
				b = c - 1;
				count++;
			}

		}

		System.out.println(count);
		input.close();
	}
}
