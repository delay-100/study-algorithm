package Round653_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int x = input.nextInt();
			int y = input.nextInt();
			int n = input.nextInt();
			int many = (n-y)/x;
			
			System.out.println(many*x+y);
		}

		input.close();
	}
}
