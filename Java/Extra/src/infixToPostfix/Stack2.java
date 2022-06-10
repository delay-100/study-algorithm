package infixToPostfix;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stack2 {
	public static Stack<Character> stack = new Stack<Character>();

	// infix를 postfix형태로 바꾸는 메소드
	public static String infixToPostfix(String str) {
		String s = "";
		int input = 0;
		int left = 0, right = 0;
		int t = -1;

		for (int i = 0; i <= str.length() - 1; i++) { 
			char ch = str.charAt(i);
			if (t != -1 && (ch < '0' || ch > '9')) { // 숫자일 때
				s += t + " ";
				t = -1;
			}
			if (ch >= '0' && ch <= '9') {
				if (t == -1) {
					t = 0;
				}
				t = 10 * t + ch - '0';
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')' || ch == ' ') { // ch가 숫자가 아닐 때
				if (ch == '+' || ch == '-') {
					if (!stack.isEmpty())
						while (stack.peek() == '*' || stack.peek() == '/') {
							s += stack.pop() + " ";
						}
					if (!stack.isEmpty())
						if (stack.peek() == '+' || stack.peek() == '-')
							s += stack.pop() + " ";
					stack.push(ch);
				} else if (ch == '*' || ch == '/') {
					if (!stack.isEmpty())
						if (stack.peek() == '*' || stack.peek() == '/') // 스택의 제일 위 값에 *나 /가 있으면
							s += stack.pop() + " "; // 스택의 제일 위 값을 꺼내서 삭제하고 s에 저장함
					stack.push(ch);
				} else if (ch == '(') { // '('괄호를 만나면 stack에 push함
					stack.push(ch);
					left++;
				} else if (ch == ')') { // ')'괄호를 만나면
					right++;
					if (!stack.isEmpty()) // 스택이 비어있는지 확인하고 스택이 비어있지 않다면
						while (stack.peek() != '(') { // '('가 나올때까지 stack의 값을 꺼낸다
							char op = stack.pop(); // (가 나오지 않을 동안 스택의 값을 꺼내서 p에 저장하고 값을 지운다.
							s += op + " ";
						}
					stack.pop(); // '('를 pop시켜 삭제한다
				}
			} else
				input = 1;
		}
		if (t != -1) {
			s += t+ " ";
		}
		while (!stack.isEmpty()) {
			s += stack.pop() + " ";
		}
		
		if (input == 1)
			return "Input Error!";
		else if (left != right)
			return "Parenthesis Error!!";

		else
			return s;
	}

	// postfix형식으로 된 수식 계산하기
	public static int calPostfix(String str) {
		Stack<Double> stack2 = new Stack<Double>();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) { // token이 연산자일떄
				double temp2 = stack2.pop();
				double temp1 = stack2.pop();
				double result = 0;

				if ("+".equals(token)) {
					result = temp1 + temp2;
				} else if ("-".equals(token)) {
					result = temp1 - temp2;
				} else if ("*".equals(token)) {
					result = temp1 * temp2;
				} else if ("/".equals(token)) {
					result = temp1 / temp2;
				}
				stack2.push(result);
			} else { // token이 숫자일 때
				stack2.push(Double.parseDouble(token));
			}
		}

		return stack2.pop().intValue(); // int형으로 변환해서 반환

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("--Enter the infix code ('exit' to end)--");
			String s = input.nextLine();
			if (s.equals("exit"))
				break;
			if (infixToPostfix(s) == "Parenthesis Error!!")
				System.out.println("Parenthesis Error!!");
			else if (infixToPostfix(s) == "Input Error!")
				System.out.println("Input Error!");
			else {
				System.out.println("postfix: " + infixToPostfix(s));
				System.out.println("calculate: " + calPostfix(infixToPostfix(s)));
			}
			System.out.println();
		}

		input.close();
	}
}
