package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		char[] list = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while ((s = br.readLine()) != null) {
			ArrayList<Character> alist = new ArrayList<Character>();
			if (s.contains("0x")) {
				char[] c = s.toCharArray();
				int l = c.length - 2;
				int sum = 0;
				int j = 2;
				while (l != 0) {
					double num = 1;
					int n = 0;
					for (int i = 0; i < 16; i++) {
						if (c[j] == list[i]) {
							n = i;
							break;
						}
					}
					num = Math.pow(16, l-1);
					num *= n;
					sum += (int)num;
					l--;
					j++;
				}
				System.out.println(sum);
			} else {
				int num = Integer.parseInt(s);
				while (num > 16) {
					alist.add(0, list[num % 16]);
					num /= 16;
				}
				alist.add(0, list[num]);
				System.out.print("0x");
				for (int i = 0; i < alist.size(); i++) {
					System.out.print(alist.get(i));
				}
				System.out.println();
			}
		}

	}
}
