package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNextInt()) {
			int N = input.nextInt();
			input.nextLine();
			String nnum = input.nextLine();
			String s = input.next();
			String[] Xii = nnum.split(" ");
			char[] Xi = s.toCharArray();
			ArrayList<Integer> num = new ArrayList<Integer>();
			ArrayList<Character> c = new ArrayList<Character>();
			for (int i = 0; i < Xii.length; i++) {

				num.add(Integer.parseInt(Xii[i]));

			}
			for (int i = 0; i < s.length(); i++) {
				c.add(Xi[i]);
			}
			boolean mung = true;
			boolean error = false;
			for (int i = 0; i < c.size(); i++) {
				if (num.isEmpty()) {
					error = true;
				} else if (c.get(i).equals('R')) {
					Collections.reverse(num);
				} else if (c.get(i).equals('B')) {
					int temp = 0;
					for (int j = 0; j < num.size(); j++) {
						if (num.get(j) > num.get(temp)) {
							temp = j;
						}
					}
					num.remove(temp);
				} else if (c.get(i).equals('S')) {
					int temp = 0;
					for (int j = 0; j < num.size(); j++) {
						if (num.get(j) < num.get(temp)) {
							temp = j;
						}
					}
					num.remove(temp);
				} else {
					mung = false;
					break;
				}
			}

			if (!mung) {
				System.out.println("Wrong Command!");
			} else if (error) {
				System.out.println("No mushrooms!");
			} else if (num.isEmpty()) {
				System.out.println("Empty!");
			} else {
				for (int i = 0; i < num.size() - 1; i++) {
					System.out.print(num.get(i) + " ");
				}
				System.out.println(num.get(num.size() - 1));
			}
		}
		input.close();
	}
}
