package Round634_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m = input.nextInt();
		
		for(int i=0; i<m; i++) {
			int n = input.nextInt();
			
			if(n<=2)
				System.out.println(0);
			else {
					System.out.println((n-1)/2);
			}
		}
		
		input.close();
	}
}
