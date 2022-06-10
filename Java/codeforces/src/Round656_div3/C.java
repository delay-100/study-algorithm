package Round656_div3;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			for (int j = 0; j < n; j++) {
				list[j] = input.nextInt();
			}
			boolean istrue = true;
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (list[j] > list[k]) {
						istrue = false;
						break;
					}

				}
			}
			if (istrue) {
				System.out.println(0);
			} else {
				int result = 0;
				
				for (int j = n-1; j >0; j--) {
					if (list[j] > list[j-1]) {
						result = j;
						break;
					}
				}
				int tmp = result;
				
				for (int j = 0; j < tmp ; j++) {
					if (list[j] > list[j + 1]) {
						result = j;
					}
				}

				System.out.println(result+1);
			}
		}

		input.close();
	}
}
