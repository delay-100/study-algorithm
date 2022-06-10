package baekjoon;

import java.util.Scanner;

public class n2577 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();

		char[] list = Integer.toString(A * B * C).toCharArray();

		int[] num = new int[10];

		for (int i = 0; i < list.length; i++) {
			num[list[i]-48]++;
		}

		for (int i = 0; i < 10; i++)
			System.out.println(num[i]);

		input.close();
	}
}
