package baekjoon;

import java.util.Scanner;

public class n1157 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a = input.next();
		a = a.toUpperCase();

		char[] array = new char[a.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = (a.charAt(i));
		}

		int[] numarray = new int[26];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (array[i] == (char)(j+65))
					numarray[j]++;
			}
		}
		
		int temp = 0;
		int tempi = 65;
		for (int i = 0; i < numarray.length; i++) {
			if (numarray[i] > temp) {
				temp = numarray[i];
				tempi = i+65;
			} else if (numarray[i] == temp) {
				tempi = -1;
			}
		}

		if (tempi == -1)
			System.out.println("?");
		else
			System.out.println((char) tempi);

		input.close();
	}
}
