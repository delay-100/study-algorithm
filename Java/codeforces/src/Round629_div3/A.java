package Round629_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			long a = input.nextLong();
			long b = input.nextLong();
			
			if(a<=b)
				System.out.println(b-a);
			else if(a%b==0)
				System.out.println(0);
			else {
				System.out.println(b*(a/b+1)-a);
			}
		}

		input.close();
	}
}
