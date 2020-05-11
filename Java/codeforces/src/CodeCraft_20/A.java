package CodeCraft_20;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		for (int i = 0; i < a; i++) {
			int num = input.nextInt();
			int max = input.nextInt();

			int[] list = new int[num];
			int sum = 0;

			for (int j = 0; j < num; j++) {
				list[j] = input.nextInt();
				sum += list[j];
			}
			if (sum < max)
				System.out.println(sum);
			else
				System.out.println(max);
		}

		input.close();
	}

}
