package Round650_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int temp = k;
			String s = input.next();
			String[] list = s.split("");
			int cnt = 0;

			for (int j = 0; j < n; j++) {
				temp++;
				if (list[j].equals("1")) {
					if (temp <= k) {
						cnt--;
					}
					temp = 0;
				} else {
					if (temp == k + 1) {
						cnt++;
						temp = 0;
					}
				}
			}
			System.out.println(cnt);
		}

		input.close();
	}
}
