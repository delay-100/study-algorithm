package Round611_div3;

import java.util.ArrayList;
import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int[] list = new int[n];
		int[] temp = new int[n + 1];

		for (int i = 0; i < n; i++) {
			list[i] = input.nextInt();
			temp[list[i]] = 1;
		}
		// 		7 0 0 1 4 0 6
		// 0 	1 0 0 1 0 1 1
		// 		1 2 3 4 5 6 7
		// 2 3 5
		// 5 2 3
		//   5 0 0 2 4
		// 0 0 1 0 1 1
		//   1 2 3 4 5
		// 1 3
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int i = 1; i < n + 1; i++) {
			if (temp[i] == 0) {
				al.add(i);
			}
		}
		al2.add(al.get(al.size() - 1));

		for (int i = 0; i < al.size(); i++) {
			al2.add(al.get(i));
		}

		int b = 0;
		for (int i = 0; i < n; i++) {
			if (list[i] == 0&&(i+1==al2.get(b))) {
				
			}
		}
		
		int a = 0;
		for (int i = 0; i < n; i++) {
			if (list[i] == 0) {
				list[i] = al2.get(a);
				a++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(list[i] + " ");
		}

		input.close();
	}
}
