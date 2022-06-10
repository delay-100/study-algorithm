package Round89_div2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			long result=0;
			if(a<b) {
				long temp = a;
				a = b;
				b = temp;
			}
			if((a!=0)&&(b!=0)) {
				if(2*b<=a)
					result = b;
				else
					result = (a+b)/3;
			}
			System.out.println(result);
		}

		input.close();
	}
}
