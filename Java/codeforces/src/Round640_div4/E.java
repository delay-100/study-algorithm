package Round640_div4;

import java.util.ArrayList;
import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int result = 0;
			int[] list = new int[n];
			for (int j = 0; j < n; j++)
				list[j] = input.nextInt();
			for (int j = 0; j < n; j++) {
				int a = list[j];
				int sum = 0;
				int q = 0;

				for (int k = 0; k < n; k++) {
					while ((sum < a) && (q < n)) {
						sum += list[q];
						q += 1;
					}
					if ((sum == a) && (q - k >= 2)) {
						result += 1;
						break;
					}
					sum -=list[k];
				}
				
			}
			System.out.println(result);
		}

		input.close();
	}

}
