package baekjoon;

import java.util.Scanner;

public class n2443 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int temp =0;
		
		for (int i = a; i >0; i--) {
			for (int j = 0; j <temp; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
			temp++;
		}

		input.close();
	}
}
