package baekjoon;

import java.util.Scanner;

public class n10474 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a==0&&b==0)
				break;
			else
			{
				System.out.println((a/b)+" "+ (a%b)+" / "+b);
			}
	
			
		}
		
		input.close();
	}

}
