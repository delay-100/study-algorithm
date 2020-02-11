package baekjoon;

import java.util.Scanner;

public class n2444 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int temp =1;
		
		for(int i=0; i<a; i++) {
			for(int j=1; j<a-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = a-1; i >0; i--) {
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
