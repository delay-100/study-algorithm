package Round644_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 1; j * j <= n; j++) {
				if (n % j == 0) {
					list.add(j);
					if (j * j < n)
						list.add(n/j);
				}
			}
			Collections.sort(list);
			
			int size = list.size();
			for(int j=0; j<size; j++) {
				if((n/list.get(j))<=k) {
					System.out.println(list.get(j));
					break;
				}
			}
			
		}

		input.close();
	}
}
