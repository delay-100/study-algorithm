package baekjoon;

import java.util.Scanner;

public class n10039 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[5];
		int sum=0;
		
		for(int i=0; i<5; i++) {
			list[i] = input.nextInt();
			if(list[i]<40)
				list[i]=40;
			sum += list[i];
		}
		System.out.println(sum/5);
		
		input.close();
	}
}
