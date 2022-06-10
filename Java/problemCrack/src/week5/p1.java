package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			char[] c = s.toCharArray();
			String e = "";
			String k = "";
			int e_num = 0;
			int k_num = 0;

			for (int i = 0; i < c.length; i++) {
				if ((c[i] >= 65 && c[i] <= 90) || (c[i] >= 97 && c[i] <= 122)) {
					e += c[i];
					e_num++;
				} else {
					k += c[i];
					k_num++;
				}
			}
			System.out.println(e+k);
			System.out.println(e_num+" "+k_num+" "+(e_num+k_num));
		}

	}
}
