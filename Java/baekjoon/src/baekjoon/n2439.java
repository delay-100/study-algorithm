package baekjoon;

import java.util.Scanner;

public class n2439 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=N-i-1; j>0; j--)
				System.out.print(" ");
			for(int j=0; j<i+1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		input.close();
	}
}
