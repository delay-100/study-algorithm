package baekjoon;

import java.util.Scanner;

public class n2869 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int v = input.nextInt();

		System.out.println((v-b)/(a-b)+1);

		input.close();
	}
}
