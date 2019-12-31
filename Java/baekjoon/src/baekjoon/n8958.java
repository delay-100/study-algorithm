package baekjoon;

import java.util.Scanner;

public class n8958 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		int count = 0, sum=0;
		int last = 0;

		num = input.nextInt();

		String[] s = new String[num];

		for (int i = 0; i < num; i++)
			s[i] = input.next();

		for (int i = 0; i < num; i++) {
			count = 0;
			last = 0;
			sum=0;
			char[] temp = s[i].toCharArray();
			for (int j = 0; j<temp.length; j++) {
				if (temp[j] == 'O') {
					count = last + 1;
					last += 1;
					sum += count;
				}
				else {
					count = 0;
					last = 0;
				}
			}
			System.out.println(sum);
		}
		input.close();

	}
}
