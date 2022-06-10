package temp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class test {

	static ArrayList<String> list = new ArrayList<>();
	static ArrayList<String> print = new ArrayList<>();
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		solve("b");
		for (int i = 0; i < print.size(); i++) {
			System.out.println(print.get(i));
		}
		sc.close();
	}

	public static void solve(String s) {
		if (s.length() == 2 * n) {
			Stack<Character> st = new Stack<Character>();
			if (s.charAt(s.length() - 1) == 'c') {
				boolean check = true;
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i) == 'b')
						st.push('b');
					else {
						if (st.isEmpty()) {
							check = false;
							break;
						} else
							st.pop();
					}
				}

				if (st.isEmpty() &&check && !list.contains(s)) 
					print.add(s);
			}

			return;
		}

		solve(s+'b');
		solve(s+'c');

	}
}
