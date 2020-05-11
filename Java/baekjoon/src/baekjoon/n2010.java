package baekjoon;

import java.util.Scanner;

public class n2010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[] list = new int[a];
		int sum = 0;
		
		for(int i=0; i<a; i++) {
			list[i] = input.nextInt();
			sum += list[i];
		}
	
		System.out.println(sum-a+1);
		
		
		input.close();
		
	}

}
