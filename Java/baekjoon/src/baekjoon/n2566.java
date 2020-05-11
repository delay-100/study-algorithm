package baekjoon;

import java.util.Scanner;

public class n2566 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int max=0;
		int w =0, l=0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				int a = input.nextInt();
				
				if(a>max) {
					max = a;
					w = i+1;
					l = j+1;
				}
				
			}
		}
		
		System.out.println(max);
		System.out.println(w+" "+l);
		input.close();
	}
}
