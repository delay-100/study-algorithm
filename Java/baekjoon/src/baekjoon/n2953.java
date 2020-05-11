package baekjoon;

import java.util.Scanner;

public class n2953 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[5];
		int max = 0;
		int num = -1;
		
		for(int i=0; i<5; i++) {
			int temp1 = input.nextInt();
			int temp2 = input.nextInt();
			int temp3 = input.nextInt();
			int temp4 = input.nextInt();
			
			list[i] = temp1+temp2+temp3+temp4;
			
			if(list[i]>max) {
				max = list[i];
				num = i+1;
			}
		}
		
		System.out.println(num +" "+ max);
		
		input.close();
	}
}
