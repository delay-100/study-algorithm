package baekjoon;

import java.util.Scanner;

public class n17010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i =0; i<n; i++) {
			int a = input.nextInt();
			String s = input.next();
			
			for(int j=0; j<a; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
		
		input.close();
	}
}
