package baekjoon;

import java.util.Scanner;

public class n2869 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		int v = input.nextInt();

		int day = 0;
		int fin = 0;
		int meter = 0;

		while (fin != 1) {
			day++;
			meter = meter + a;
			if (meter == v)
				fin = 1;
			meter = meter - b;
		}

		System.out.println(day);

		input.close();
	}
}
