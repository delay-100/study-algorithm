package week9;

import java.util.Scanner;

public class p1 {

	public static int N;
	public static int[] list;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		for (int i = 1; i <= N; i++) {
			list = new int[N + 1];
			list[1] = i;

			findQueen(1);

		}

		input.close();
	}
	
	public static void findQueen(int num) {
		if (num == N) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (j == list[i])
						System.out.print("Q ");
					else
						System.out.print("* ");
				}

				System.out.println();
			}
			System.out.println();
		}

		else {
			for (int i = 1; i <= N; i++) {
				list[num + 1] = i;
				boolean istrue = true;
				for (int j = 1; j < num + 1; j++) {
					if (list[j] == list[num + 1] || Math.abs(j - (num + 1)) == Math.abs(list[j] - list[num + 1])) {
						istrue = false;
						break;
					}
				}
				if (istrue) {
					findQueen(num + 1);
				}
			}
		}

	}
}
