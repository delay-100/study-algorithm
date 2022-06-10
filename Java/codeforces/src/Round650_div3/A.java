package Round650_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			String s = input.next();
			String[] sp = s.split("");
			String st = "";

			int l = sp.length;
			String temp = "";
			for (int j = 0; j < l; j++) {
				if (!temp.equals(sp[j])||((j==l-1))) {
					st += sp[j];
					temp = sp[j];
				} else {
					temp = "";
				}
			}
			
			System.out.println(st);
		}

		input.close();
	}
}