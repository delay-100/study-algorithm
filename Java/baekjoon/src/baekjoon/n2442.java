package baekjoon;

import java.util.Scanner;

public class n2442 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=1; j<a-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}
