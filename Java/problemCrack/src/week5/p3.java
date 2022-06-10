package week5;

import java.util.Scanner;

public class p3 {
	static int n;
	static String[] s1, s2;
	static char[] cc;

	public static void main(String[] args) {
		// the quick brown fox jumps over the lazy dog
		Scanner input = new Scanner(System.in);
		String ss = "the quick brown fox jumps over the lazy dog";
		cc = ss.toCharArray();
		String s = input.nextLine();
		char[] c = s.toCharArray();
		n = input.nextInt();
		s1 = new String[n];
		s2 = new String[n];

		for (int i = 0; i < n; i++) {
			s1[i] = input.next();
		}
		for (int i = 0; i < n; i++) {
			s2[i] = input.next();
		}

		char[] map = new char['z' + 1];
		char[] inv = new char['z' + 1];

		for (int i = 0; i < s.length(); i++) {
			if ((c[i] >= 97 && c[i] <= 122)) {
				map[cc[i]] = c[i];
				inv[c[i]] = cc[i];
			}
		}
		search(0, map, inv);

		input.close();
	}

	public static void search(final int k, char[] map, char[] inv) {
		if (k == n) {
			for (int i = 0; i < cc.length; i++) {
				if (cc[i] == ' ') {
					cc[i] = ' ';
				} else {
					cc[i] = map[cc[i]];
				}
			}
			for (int i = 0; i < cc.length; i++) {
				System.out.print(cc[i]);
			}
			return;
		}
		char[] map2 = new char['z' + 1];
		char[] inv2 = new char['z' + 1];
		for (int i = 0; i < n; i++) {
			for (int q = 0; q < map2.length; q++) {
				map2[q] = map[q];
			}
			for (int q = 0; q < inv2.length; q++) {
				inv2[q] = inv[q];
			}
			int num = 0;
			if (s1[k].length() == s2[i].length()) {
				for (int j = 0; j < s1[k].length(); j++) {
					if ((map2[s1[k].charAt(j)] != '\0' && (map2[s1[k].charAt(j)] != s2[i].charAt(j)))
							|| (inv2[s2[i].charAt(j)] != '\0' && (inv2[s2[i].charAt(j)] != s1[k].charAt(j)))) {
						break;
					} else {
						map2[s1[k].charAt(j)] = s2[i].charAt(j);
						inv2[s2[i].charAt(j)] = s1[k].charAt(j);
						num++;
					}
				}

			}
			if (num == s1[k].length()) {
				search(k+1, map2, inv2);
			}
		}

	}
}
