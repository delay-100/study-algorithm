package baekjoon;

import java.util.Scanner;

public class n10953 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		String[] list = new String[n];
		String[] num = new String[2];
		int a;
		
		for (int i = 0; i < n; i++) {
			list[i] = input.next();
		}
		
		for (int j = 0; j < n; j++) {
			num = list[j].split(",");
			a = Integer.parseInt(num[0])+Integer.parseInt(num[1]);
			
			System.out.println(a);
		}

		input.close();
	}
}
