package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			boolean istrue = false;
			istrue = (b == 1);
			while (a != 1) {
				if (a == b) {
					istrue = true;
					break;
				}
				if (a % 2 == 0) {
					a /= 2;
				} else {
					a = (a * 3) + 1;
				}
			}

			if (istrue)
				System.out.println("Y");
			else
				System.out.println("N");
		}
	}
}
