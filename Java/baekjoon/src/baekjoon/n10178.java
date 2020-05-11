package baekjoon;

import java.util.Scanner;

public class n10178 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			int num = input.nextInt();
			int broNum = input.nextInt();
			
			System.out.println("You get "+(num/broNum)+" piece(s) and your dad gets "+(num%broNum)+" piece(s).");
			
		}
		
		input.close();
	}
}
