package Round642_div3;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a==1)
				System.out.println(0);
			else if(a==2)
				System.out.println(b);
			else
				System.out.println(2*b);
		}
		
		
		input.close();
	}
}
