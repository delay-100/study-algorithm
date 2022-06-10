package Round640_div4;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int result = 0;

			if (k % (n - 1) == 0) 
				result = k / (n - 1) * n - 1; 
			else
				result = k / (n - 1) *n+ k % (n - 1);

			System.out.println(result);
		}
		input.close();

	}
}
