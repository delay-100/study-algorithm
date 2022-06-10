package Round640_div4;

import java.util.ArrayList;
import java.util.Scanner;

public class G {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();

			if (n <= 3)
				System.out.println(-1);
			else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				for (int j = n; j > 0; j = j - 1) {
					if (j % 2 == 1)
						list.add(j);
				}
				list.add(4);
				list.add(2);
				for (int j = 6; j < n+1; j = j + 2) {
					list.add(j);
				}
				for (int j = 0; j < n; j++) {
					System.out.print(list.get(j) + " ");
				}
				System.out.println();
			}
		}

		input.close();
	}
}
