package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p2 {
	static List<String> st;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.next();
		char[] c = s.toCharArray();
		st = new ArrayList<String>();
		solve(c, 0, c.length);
		
		Collections.sort(st);
		for(int i=0; i<st.size(); i++)
			System.out.println(st.get(i));
		input.close();
	}

	public static void solve(char[] c, int d, int n) {
		if (d == n) {
			String ss = "";
			for (int i = 0; i < n; i++) {
				ss += c[i];
			}
			if (!st.contains(ss)) {
				st.add(ss);
			}
			return;
		}
		for (int i = d; i < n; i++) {
			char tmp = c[d];
			c[d] = c[i];
			c[i] = tmp;
			solve(c, d + 1, n);
			c[i] = c[d];
			c[d] = tmp;
		}
	}
}
