package Round640_div4;

import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			for (int j = 0; j < n; j++) {
				list[j] = input.nextInt();
			}
			int l = 0;
			int r = n - 1;
			int leftsum = 0;
			int rightsum = 0;
			int left = 0;
			int right = 0;
			int count = 0;

			while (l <= r) {
				if (count % 2 == 0) {
					int sum = 0;
					while ((l <= r) && (sum <= rightsum)) {
						sum += list[l];
						l += 1;
					}
					left += sum;
					leftsum = sum;
				} else if (count % 2 == 1) {
					int sum = 0;
					while ((l <= r) && (sum <= leftsum)) {
						sum += list[r];
						r -= 1;
					}
					right += sum;
					rightsum = sum;
				}
				count += 1;
			}
			System.out.println(count + " " + left + " " + right);
		}

		input.close();
	}

}
