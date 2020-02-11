package baekjoon;

import java.util.Scanner;

public class n1100 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] chess = new String[8];
		int count = 0;

		for (int i = 0; i < 8; i++) {
			chess[i] = input.next();
		}

		for (int i = 0; i < 8; i++) {
			String[] array = chess[i].split("");
			if ((i+1) % 2 == 0) {
				for (int j = 0; j < 8; j++) {
					if ((j+1) % 2 == 0 && array[j].equals("F")) {
						count++;
					}
				}

			} else {
				for (int j = 0; j < 8; j++) {
					if ((j+1) % 2 == 1 && array[j].equals("F")) {
						count++;
					}
				}
			}

		}

		System.out.println(count);

		input.close();
	}
}
