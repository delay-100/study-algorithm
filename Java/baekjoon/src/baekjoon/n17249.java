package baekjoon;

import java.util.Scanner;

public class n17249 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s = input.next();
		String[] array = s.split("");
		int right = 0;
		int left = 0;

		for (int i = 0; i < s.length(); i++) {
			if (array[i].equals("(")) {
				break;
			}
			else if (array[i].equals("@")) {
				left++;
			}
		}
		
		for (int i = s.length()-1; i >-1; i--) {
			if (array[i].equals(")")) {
				break;
			}
			else if (array[i].equals("@")) {
				right++;
			}

		}

		System.out.println(left +" " + right);
		input.close();
	}
}
