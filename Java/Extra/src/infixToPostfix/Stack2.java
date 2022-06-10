package infixToPostfix;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stack2 {
	public static Stack<Character> stack = new Stack<Character>();

	// infix�� postfix���·� �ٲٴ� �޼ҵ�
	public static String infixToPostfix(String str) {
		String s = "";
		int input = 0;
		int left = 0, right = 0;
		int t = -1;

		for (int i = 0; i <= str.length() - 1; i++) { 
			char ch = str.charAt(i);
			if (t != -1 && (ch < '0' || ch > '9')) { // ������ ��
				s += t + " ";
				t = -1;
			}
			if (ch >= '0' && ch <= '9') {
				if (t == -1) {
					t = 0;
				}
				t = 10 * t + ch - '0';
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '(' || ch == ')' || ch == ' ') { // ch�� ���ڰ� �ƴ� ��
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
						if (stack.peek() == '*' || stack.peek() == '/') // ������ ���� �� ���� *�� /�� ������
							s += stack.pop() + " "; // ������ ���� �� ���� ������ �����ϰ� s�� ������
					stack.push(ch);
				} else if (ch == '(') { // '('��ȣ�� ������ stack�� push��
					stack.push(ch);
					left++;
				} else if (ch == ')') { // ')'��ȣ�� ������
					right++;
					if (!stack.isEmpty()) // ������ ����ִ��� Ȯ���ϰ� ������ ������� �ʴٸ�
						while (stack.peek() != '(') { // '('�� ���ö����� stack�� ���� ������
							char op = stack.pop(); // (�� ������ ���� ���� ������ ���� ������ p�� �����ϰ� ���� �����.
							s += op + " ";
						}
					stack.pop(); // '('�� pop���� �����Ѵ�
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

	// postfix�������� �� ���� ����ϱ�
	public static int calPostfix(String str) {
		Stack<Double> stack2 = new Stack<Double>();
		StringTokenizer st = new StringTokenizer(str, " ");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) { // token�� �������ϋ�
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
			} else { // token�� ������ ��
				stack2.push(Double.parseDouble(token));
			}
		}

		return stack2.pop().intValue(); // int������ ��ȯ�ؼ� ��ȯ

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
