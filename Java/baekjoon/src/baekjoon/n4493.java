package baekjoon;

import java.util.Scanner;

public class n4493 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();

		int temp1 = 0;
		int temp2 = 0;

		for (int i = 0; i < a; i++) {
			int b = input.nextInt();
			for (int j = 0; j < b; j++) {
				String s1 = input.next();
				String s2 = input.next();

				if (s1.equals(s2))
					;
				else {
					if (s1.equals("S") && s2.equals("R"))
						temp2++;
					else if (s1.equals("S") && s2.equals("P"))
						temp1++;
					else if (s1.equals("R") && s2.equals("S"))
						temp1++;
					else if (s1.equals("R") && s2.equals("P"))
						temp2++;
					else if (s1.equals("P") && s2.equals("S"))
						temp2++;
					else if (s1.equals("P") && s2.equals("R"))
						temp1++;
				}

			}
			if (temp1 > temp2)
				System.out.println("Player 1");
			else if (temp1 < temp2)
				System.out.println("Player 2");
			else
				System.out.println("TIE");
			temp1 = 0;
			temp2 = 0;
		}

		input.close();
	}

}
