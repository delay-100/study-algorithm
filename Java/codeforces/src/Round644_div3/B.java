package Round644_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}

			Collections.sort(list);
			int temp = 0;
			int result = 1000;
			for (int j = 0; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (list.get(j) == list.get(k)) {
						temp = 1;
						break;
					}
					else if(list.get(k)-list.get(j)<result)
						result = list.get(k)-list.get(j);
				}
				if(temp==1)
					break;
			}
			if (temp == 1) {
				System.out.println(0);
			} else {
				System.out.println(result);
			}
		}
		input.close();
	}
}
