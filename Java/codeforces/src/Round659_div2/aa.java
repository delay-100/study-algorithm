package Round659_div2;

import java.util.ArrayList;
import java.util.Scanner;

public class aa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (long i = 0; i < t; i++) {
			int n = input.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			int highindex = 0;
			int value = 0;

			for (int j = 0; j < n; j++) {
				a.add(input.nextInt());
				if (a.get(j) > value) {
					highindex = j;
					value = a.get(j);
				}
			}
			a.add(highindex, value);
			n++;

			String ws = "";
			char q = 'a';
			boolean istrue = true;

//			for (int j = 0; j < n; j++) {
//				System.out.print(a.get(j)+" ");
//			}
			for (int j = 0; j < n; j++) {

				// 0이 나온 경우
				if (a.get(j) == 0) {
					istrue = false;
					if (q != 'b')
						q = 'b';
					else
						q = 'a';
					ws = "";
					ws += q;
					System.out.print(ws);
				}
				// 앞에 0이 나오고 지금 숫자가 0보다 큰 경우
				else if (istrue == false && a.get(j) > 0) {
					
					for (int k = 0; k < a.get(j); k++) {
						if (k > 0) {
							ws += q;
							System.out.print(ws);
						} else
							System.out.print(q);
					}
				}
				// 앞에 0이 나오지 않고 숫자가 0보다 큰경우
				else {
					for (int k = 0; k < a.get(j); k++)
						System.out.print(q);

				}

				System.out.println();
			}
		}

		input.close();
	}
}
