package baekjoon;

import java.util.Scanner;

public class n5565 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int sum = 0;
		int[] list = new int[9];
		
		for(int i=0; i<9; i++) {
			list[i] = input.nextInt();
			sum += list[i];
		}
		
		System.out.println(a-sum);
		
		input.close();
	}
}
