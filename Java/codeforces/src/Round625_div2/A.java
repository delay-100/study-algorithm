package Round625_div2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int[] list1 = new int[a];
		int[] list2 = new int[a];

		for (int j = 0; j < a; j++) {
			list1[j] = input.nextInt();
		}
		for (int j = 0; j < a; j++) {
			list2[j] = input.nextInt();
		}

		int out = -1;
		int n1 = 0;
		int n2 = 0;
		for (int i = 0; i < a; i++) {
			if (list1[i] == list2[i])
				;
			else if (list1[i] > list2[i]) {
				n1++;
			} else {
				n2++;
			}
		}

		for (int i = 1; i <= a; i++) {
			if ((n1 * i) >= (n2+1)) {
				out = i;
				break;
			}
		}
		System.out.println(out);

		input.close();
	}
}
