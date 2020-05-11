package baekjoon;

import java.util.Scanner;

public class n4101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a==0&&b==0)
				break;
			
			if(a>b) {
				System.out.println("Yes");
			}
			else
				System.out.println("No");
			
		}
		
		input.close();
	}

}
