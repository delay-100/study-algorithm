package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			String[] c = s.split(" ");
			int n = Integer.parseInt(c[0]);
			ArrayList<String> sss = new ArrayList<String>();
			String ss = c[1] + " ";
			sss.add(c[1]);
			
			for (int i = 2; i < n+1; i++) {
				char s1 = c[i].charAt(0);
				char s2 = c[i-1].charAt(c[i-1].length() - 1);
				if(sss.contains(c[i]))
					break;
				if(s1==s2) {
					ss+=c[i]+" ";
					sss.add(c[i]);
				}
				else {
					break;
				}
			}

			System.out.println(ss);
		}

	}
}
