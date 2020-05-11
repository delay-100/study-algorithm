package baekjoon;

import java.util.Scanner;

public class n5523 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int aCount = 0, bCount = 0;
		
		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a>b)
				aCount++;
			else if(a<b)
				bCount++;
			
		}

		System.out.println(aCount +" " + bCount);
		
		input.close();
	}
}
