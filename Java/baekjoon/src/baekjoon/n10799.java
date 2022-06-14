package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String s = bf.readLine();

		String[] sl = s.split("");
		Stack<String> st = new Stack<String>();
		int count = 0;
		for (int i = 0; i < sl.length; i++) {
			if(sl[i].equals("(")) {
				st.push(sl[i]);
			}
			else if (sl[i].equals(")")) {
				if (sl[i-1].equals("(")) {
					st.pop();
					count+=st.size();
				} else {
					st.pop();
					count++;
				}
			}
		}
		System.out.print(count);
	}
}
