package baekjoon;

import java.util.Scanner;

public class n10870 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int pibo1 = 0;
		int pibo2 = 1;
		int temp =0;
		
		for(int i=0; i<a; i++) {
			temp = pibo1+pibo2;
			pibo1 = pibo2;
			pibo2 = temp;
		}
		
		System.out.println(pibo1);
		input.close();
	}
}
