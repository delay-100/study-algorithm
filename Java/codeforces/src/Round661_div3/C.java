package Round661_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int[] listsum = new int[51];
			ArrayList<Integer> list = new ArrayList<Integer>();

			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			int manynum = 0;
			int index = 0;
			Collections.sort(list);
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					if (k == j)
						continue;
					else {
						listsum[list.get(j) + list.get(k)]++;
					}
				}
			}

			for (int j = 0; j < 51; j++) {
				if (manynum < listsum[j]) {
					manynum = listsum[j];
					index = j;
				}
			}
			System.out.println(index);
			int j = n - 1;
			int k = 0;
			int sum = 0;
			while (true) {
				if (j <= k)
					break;
				System.out.println("list.get(j)" + list.get(j));
				System.out.println("list.get(k)" + list.get(k));
				if (index == list.get(j) + list.get(k)) {
					sum++;
					list.remove(j);
					list.remove(k);

				}
				else {
					j--;
					k++;
				}
			}
			System.out.println(sum);
		}

		input.close();
	}
}
