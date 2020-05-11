package baekjoon;

import java.util.Scanner;

public class n10395 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list1 = new int[5];
		int[] list2 = new int[5];
		int n = 0;

		for (int i = 0; i < 5; i++) {
			list1[i] = input.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			list2[i] = input.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			if (list1[i] == list2[i]) {
				n = 1;
				break;
			}
		}
		if(n==1)
			System.out.println("N");
		else
			System.out.println("Y");

		input.close();
	}

}
