package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4458 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(bf.readLine());
		String[] s = new String[a];
		
		for (int i = 0; i < a; i++) {
			s[i] = bf.readLine();
		}

		for (int i = 0; i < a; i++) {
			String[] sp = s[i].split("");
			System.out.print(sp[0].toUpperCase());
			for (int j = 1; j < sp.length; j++) {
				System.out.print(sp[j]);
			}
			System.out.println();
		}

	}
}
