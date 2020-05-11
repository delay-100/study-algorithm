package Round640_div4;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int m = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();

			if (m == 10000)
				list.add(m);
			else {
				if (m >= 1000) {
					list.add((m/1000)*1000);
					m = m % 1000;
				}
				if (m >= 100) {
					list.add((m / 100)*100);
					m = m % 100;
				}
				if (m >= 10) {
					list.add((m / 10)*10);
					m = m % 10;
				}
				if (m > 0 && m <= 9)
					list.add(m);
			}
			System.out.println(list.size());
			for (int j = 0; j < list.size(); j++)
				System.out.print(list.get(j) + " ");
			System.out.println();

		}

		input.close();
	}
}
