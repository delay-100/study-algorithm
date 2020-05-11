package baekjoon;

import java.util.Scanner;

public class n5597 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] list = new int[31];
		
		for(int i=0; i<28; i++) {
			int a = input.nextInt();
			list[a] = 1;
		}
		
		for(int i=1; i<31; i++) {
			if(list[i]!=1)
				System.out.println(i);
		}
		input.close();
	}
}
