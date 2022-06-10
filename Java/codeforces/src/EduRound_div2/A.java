package EduRound_div2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			long l = input.nextLong();
			long r = input.nextLong();
			
			if(l*2<=r)
				System.out.println(l+" "+l*2);
			else
				System.out.println("-1 -1");
//			long x = l, y = r;
//			long lcm;
//			while (true) {
//				if (l>1&&l + 1 == r) {
//					System.out.println(-1 + " " + -1);
//					break;
//				}
//				long temp = 1;
//				while (temp > 0) {
//					temp = r % l;
//					r = l;
//					l = temp;
//				}
//				lcm = x * y / r;
//				if (lcm <= y) {
//					System.out.println(x + " " + lcm);
//					break;
//				}
//
//				x++;
//				l += x;
//				r = y;
//			}
		}
		input.close();
	}
}
