package Round660_div2;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = input.nextInt();
			
			int temp = n*3; // n*4-n
			int k = temp/4;
			int q = n-k;
			
			for(int j=0; j<k; j++) {
				System.out.print(9);
			}
			for(int j=0; j<q; j++) {
				System.out.print(8);
			}
			System.out.println();
			
		}
		
		
		input.close();
	}
}
