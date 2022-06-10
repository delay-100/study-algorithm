package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = "";
		while ((s = bf.readLine()) != null) {
			ArrayList<String> alist = new ArrayList<String>();
			String[] list = s.split("");
			int[] num = new int[s.length()];
			String[] arry = new String[(int) Math.pow(2, s.length())];
			String[] arry2 = new String[(int) Math.pow(2, s.length())];

			for (int i = 0; i < s.length(); i++) {
				num[i] = Integer.parseInt(list[i]);
			}

			for (int i = 0; i < (int) Math.pow(2, s.length()); i++) {
				String bin = Integer.toBinaryString(i);
				if (bin.length() != s.length()) {
					int n = s.length() - bin.length();
					String temp = "";
					for (int k = 0; k < n; k++) {
						temp += "0";
					}
					temp += bin;
					bin = temp;
				}
				arry[i] = bin;
				arry2[i] = bin;
			}

			for (int i = 0; i < (int) Math.pow(2, s.length()); i++) {
				StringBuilder st = new StringBuilder();
				if (arry2[i].charAt(1) != arry2[i].charAt(s.length() - 1)) {
					if (arry2[i].charAt(0) == '0') {
						st.append('1');
					} else {
						st.append('0');
					}
				} else {
					st.append(arry2[i].charAt(0));
				}
				for (int j = 1; j <= s.length() - 2; j++) {
					if (arry2[i].charAt(j - 1) != arry2[i].charAt(j + 1)) {
						if (arry2[i].charAt(j) == '0') {
							st.append('1');
						} else {
							st.append('0');
						}
					} else {
						st.append(arry2[i].charAt(j));
					}
				}

				if (arry2[i].charAt(0) != arry2[i].charAt(s.length() - 2)) {
					if (arry2[i].charAt(s.length()-1) == '0') {
						st.append('1');
					} else {
						st.append('0');
					}
				} else {
					st.append(arry2[i].charAt(s.length() - 1));
				}

				if (s.equals(st.toString())) {
					alist.add(arry2[i]);
				}
			}

			if (alist.isEmpty())
				System.out.println("zero");
			else if (alist.size() == 1)
				System.out.println(alist.get(0));
			else
				System.out.println("multiple");
		}
	}
}
