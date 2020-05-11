package Round635_div2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			int[] list = new int[4];
			
			for(int j=0; j<4; j++) {
				list[j] = input.nextInt();
			}
			
			System.out.println(list[0]+" " + list[2]+ " "+list[2]);
			
		}
		
		
		input.close();
	}
}
