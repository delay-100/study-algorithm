package baekjoon;

import java.util.Scanner;

public class n10990 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		a--;

		for (int i = 0; i < a; i++) {
			System.out.print(" ");
		}
		System.out.println("*");

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i - 1; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int k=0; k<2*i+1; k++)
				System.out.print(" ");
			System.out.println("*");
		}

		input.close();
	}
}
