package Round644_div3;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int num = 0;
			if (a >= b) {
				num = 2 * b;
				if(a>num)
					System.out.println(a*a);
				else
					System.out.println(num*num);
			}
			else {
				num = 2 * a;
				if(b>num)
					System.out.println(b*b);
				else
					System.out.println(num*num);
			}
		}
		input.close();
	}
}
