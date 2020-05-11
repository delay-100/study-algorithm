package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class n2935 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		BigInteger a = input.nextBigInteger();
		String s = input.next();
		BigInteger b = input.nextBigInteger();

		if(s.equals("*")) {
			System.out.println(a.multiply(b));
		}
		else
			System.out.println(a.add(b));
		input.close();
	}
}
