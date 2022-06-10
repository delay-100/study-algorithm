package Round624_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			int num;
			if (a > b) {
				num = a - b;
				if(num%2==0)
					System.out.println("1");
				else
					System.out.println("2");
				
			} else if (a < b) {
				num = b - a;
				if(num%2==0)
					System.out.println("2");
				else
					System.out.println("1");
					
			} else {
				System.out.println("0");
			}

		}
		input.close();
	}
}
