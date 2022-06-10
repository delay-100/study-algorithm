package Round615_div3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[][] list = new int[n][2];
			String s = "";
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 2; k++) {
					list[j][k] = input.nextInt();
				}
			}

			Arrays.sort(list, (o1, o2) -> {
				if (o1[0] == o2[0]) {
					return Integer.compare(o1[1], o2[1]);
				} else {
					return Integer.compare(o1[0], o2[0]);
				}
			});
//			for (int j = 0; j < n; j++) {
//				for (int k = 0; k < 2; k++) {
//					System.out.print(list[j][k] + " ");
//				}
//				System.out.println();
//			}
			boolean istrue = true;
			int right = 0; // 누적 right
			int up = 0; // 누적 up
			int now_right = 0; // 지금 right
			int now_up = 0; // 지금 up

			for (int j = 0; j < n; j++) {
				right = now_right;
				up = now_up;
				now_right = list[j][0];
				now_up = list[j][1];
				int temp_right = now_right - right;
				int temp_up = now_up - up;
				if (temp_up < 0) {
					istrue = false;
					break;
				} else if (temp_right > 0) {
					for (int k = 0; k < temp_right; k++)
						s += "R";
					if (temp_up > 0) {
						for (int k = 0; k < temp_up; k++)
							s += "U";
					}
				} else if (temp_right == 0 && temp_up > 0) {
					for (int k = 0; k < temp_up; k++)
						s += "U";
				}
			}

			if (istrue) {
				System.out.println("YES");
				System.out.println(s);

			} else
				System.out.println("NO");

		}

		input.close();
	}
}
