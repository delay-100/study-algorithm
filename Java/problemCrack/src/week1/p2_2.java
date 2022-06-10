package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		char[] list = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while ((s = br.readLine()) != null) {
			ArrayList<Character> alist = new ArrayList<Character>();
			if (s.startsWith("0x")) {
				char[] c = s.toCharArray();
				int num = 0;
				int n = 0;
				for (int k = 2; k < c.length; k++) {
					n = c[k] - (c[k] >= 65 ? 55 : 48);
					num = 16 * num + n;
				}
				System.out.println(num);
			} else {
				int num = Integer.parseInt(s);
				while (num > 0) {
					alist.add(0, list[num % 16]);
					num /= 16;
				}
				alist.add(0, list[num]);
				System.out.print("0x");
				if(alist.get(0)!='0') {
					System.out.print(alist.get(0));
				}
				for (int i = 1; i < alist.size(); i++) {
					System.out.print(alist.get(i));
				}
				System.out.println();
			}
		}

	}
}
