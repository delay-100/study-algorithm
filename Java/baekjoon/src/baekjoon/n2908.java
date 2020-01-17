package baekjoon;

import java.util.Scanner;

public class n2908 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = 0;
		int num = -1;

		String a = input.next();
		String b = input.next();

		int[] arrayA = new int[a.length()];
		int[] arrayB = new int[b.length()];

		for (int i = a.length() - 1; i > -1; i--) {
			arrayA[j] = a.charAt(i) - '0';
			arrayB[j] = b.charAt(i) - '0';
			j++;
		}

		for (int i = 0; i < a.length(); i++) {
			if (arrayA[i] > arrayB[i]) {
				num = 1;
				break;
			} else if (arrayA[i] < arrayB[i]) {
				num = 0;
				break;
			}
		}

		if (num == 1) {
			for (int i = 0; i < a.length(); i++) {
				System.out.print(arrayA[i]);
			}
		} else if (num == 0) {
			for (int i = 0; i < a.length(); i++) {
				System.out.print(arrayB[i]);
			}
		}

		input.close();
	}
}
