package Round653_div3;

import java.util.Scanner;
import java.util.Stack;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			int cnt = 0;
			Stack<Character> stack = new Stack<Character>();
			
			for(int j=0; j<n; j++) {
				char c = s.charAt(j);
				
				if(c=='(') {
					stack.push(c);
				}
				else {
					if(stack.isEmpty() || (c =stack.pop())!='(') {
						cnt++;
					}
				}
			}
			
			System.out.println(cnt);

		}

		input.close();

	}
}
