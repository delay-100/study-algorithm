package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class n2750 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int[] list = new int[a];

		for (int i = 0; i < a; i++) {
			list[i] = input.nextInt();
		}

		Arrays.sort(list);

		for (int i = 0; i < a; i++) {
			System.out.println(list[i]);
		}

		input.close();
	}
}
