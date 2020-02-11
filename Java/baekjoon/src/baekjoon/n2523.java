package baekjoon;

import java.util.Scanner;

public class n2523 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int k=0; k<i+1; k++)
				System.out.print("*");
			System.out.println();
		}
		a--;
		
		for(int i=0; i<a; i++) {
			for(int k=0; k<a-i; k++)
				System.out.print("*");
			System.out.println();
		}
		
		input.close();
	}
}
