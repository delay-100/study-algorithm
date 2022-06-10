package week14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int[] M = new int[N];

		for (int i = 0; i < N; i++) {
			M[i] = input.nextInt();
		}
		int[] list = new int[N];

		int result = 0;

		if (N <= 2) {
			for (int i = 0; i < N; i++) {
				result += M[i];
			}
		}
		else {
			list[0] = M[0];
			list[1] = list[0] + M[1];
			list[2] = max(list[1], M[0] + M[2], M[1] + M[2]);
			for (int i = 3; i < N; i++) {
				list[i] = max(list[i - 1], M[i] + list[i - 2], M[i] + M[i - 1] + list[i - 3]);
			}
			result = list[N - 1];
		}

		System.out.println(result);
		input.close();
	}

	private static int max(int i, int j, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(i);
		list.add(j);
		list.add(k);
		Collections.sort(list);
		int num = list.get(2);
		return num;
	}

}
