package todayStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bf.readLine());

		Stack<Integer> st = new Stack<Integer>();  
		String s ="";
		for(int i=0; i<a; i++) {
			s = bf.readLine();
			String[] sl = s.split(" ");
			if (sl[0].equals("push")) {
				st.push(Integer.parseInt(sl[1]));
			}
			else if (sl[0].equals("pop")) {
				System.out.println(st.isEmpty()?-1:st.pop());
			}
			else if (sl[0].equals("size")) {
				System.out.println(st.size());
			}
			else if (sl[0].equals("empty")) {
				System.out.println(st.isEmpty()?1:0);
			}
			else if (sl[0].equals("top")) {
				System.out.println(st.isEmpty()?-1:st.peek());
			}
		}
	}
}
