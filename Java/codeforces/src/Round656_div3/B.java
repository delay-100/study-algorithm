package Round656_div3;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt() * 2;
			LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

			for (int j = 0; j < n; j++)
				set.add(input.nextInt());

			for (int s : set)
				System.out.print(s + " ");
			System.out.println();
		}

		input.close();
	}
}
