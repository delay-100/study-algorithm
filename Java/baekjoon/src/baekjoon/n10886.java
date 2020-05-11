package baekjoon;

import java.util.Scanner;

public class n10886 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int[] list = new int[a];
		int cute = 0, ncute = 0;
		
		for(int i=0; i<a; i++) {
			list[i] = input.nextInt();
			if(list[i] == 1)
				cute++;
			else
				ncute++;
		}
		
		if(cute>ncute)
			System.out.println("Junhee is cute!");
		else
			System.out.println("Junhee is not cute!");
		input.close();
	}
}
