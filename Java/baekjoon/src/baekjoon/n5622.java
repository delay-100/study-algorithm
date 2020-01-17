package baekjoon;

import java.util.Scanner;

public class n5622 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a = input.next();
		char[] array = new char[a.length()];

		for (int i = 0; i < a.length(); i++)
			array[i] = a.charAt(i);

		int sum = 0;
		for (int j = 0; j < a.length(); j++) {
			int time = 0;

				switch (array[j]) {
				case 'A':
				case 'B':
				case 'C':
					time = 2;
					break;
				case 'D':
				case 'E':
				case 'F':
					time = 3;
					break;
				case 'G':
				case 'H':
				case 'I':
					time = 4;
					break;
				case 'J':
				case 'K':
				case 'L':
					time = 5;
					break;
				case 'M':
				case 'N':
				case 'O':
					time = 6;
					break;
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
					time = 7;
					break;
				case 'T':
				case 'U':
				case 'V':
					time = 8;
					break;
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					time = 9;
					break;
				}

				sum += time;
			}
		

		System.out.println(sum+a.length());

		input.close();
	}
}
