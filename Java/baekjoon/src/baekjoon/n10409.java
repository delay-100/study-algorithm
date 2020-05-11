package baekjoon;

import java.util.Scanner;

public class n10409 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int num = 0;

		int[] list = new int[a];

		for (int i = 0; i < a; i++)
			list[i] = input.nextInt();

		for (int i = 0; i < a; i++) {

			if (b - list[i] == 0) {
				num++;
				break;
			} else if (b - list[i] > 0)
				num++;
			else
				break;

			b -= list[i];
		}

		System.out.println(num);

		input.close();
	}
}
