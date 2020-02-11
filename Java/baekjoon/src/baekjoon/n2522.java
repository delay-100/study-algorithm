package baekjoon;

import java.util.Scanner;

public class n2522 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int temp =1;
		for(int i=0; i<a; i++) {
			for(int j=0; j<a-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<temp; k++)
				System.out.print("*");
			temp++;
			System.out.println();
		}
		temp =1;
		for(int i=0; i<a-1; i++) {
			for(int k=0; k<temp; k++)
				System.out.print(" ");
			temp++;
			for(int j=0; j<a-i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close();
	}
}
