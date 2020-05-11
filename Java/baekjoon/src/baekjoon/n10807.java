package baekjoon;

import java.util.Scanner;

public class n10807 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();
		int[] list = new int[n];
		
		for(int i=0; i<n; i++) {
			list[i] = input.nextInt();
		}
		
		int a = input.nextInt();
		
		int num=0;
		
		for(int i=0; i<n; i++) {
			if(a==list[i])
				num++;
		}
		
		System.out.println(num);
		
		input.close();
	}
	
}
