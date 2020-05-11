package baekjoon;

import java.util.Scanner;

public class n10480 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a= input.nextInt();
		int n = 0;
		
		for(int i=0; i<a; i++) {
			n = input.nextInt();
			
			if(n%2==0)
				System.out.println(n+" is even");
			else
				System.out.println(n+" is odd");
		}
		
		
		input.close();
	}
}
