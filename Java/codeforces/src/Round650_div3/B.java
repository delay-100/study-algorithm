package Round650_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] list = new int[n];
			for (int j = 0; j < n; j++)
				list[j] = input.nextInt();

			int even = 0, odd = 0;
			for (int j = 0; j < n; j++) {
				if (list[j] % 2 == 0 && j % 2 == 1) { //value°¡ Â¦¼ö ÀÌ°í index°¡ È¦¼ö
					even++;
				} else if (list[j] % 2 == 1 && j % 2 == 0) {//value°¡ È¦¼ö ÀÌ°í index°¡ Â¦¼ö
					odd++;
				}
			}
			System.out.println(even == odd ? odd : -1);
		}
		input.close();
	}
}
