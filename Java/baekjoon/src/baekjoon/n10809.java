package baekjoon;

import java.util.Scanner;

public class n10809 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String s = input.next();
		char[] temp = s.toCharArray();
		int[] list = new int[26];
		
		for (int i = 0; i < list.length; i++)
			list[i] = -1;

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if ((temp[i]== (j+97)) && (list[j] == -1)) {
					list[j] = i;
					break;
				}
			}
		}

		for (int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
		input.close();

	}
}