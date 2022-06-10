package week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			char[] tom = new char[5];
			char[] jerry = new char[5];
			for (int i = 0; i < 5; i++) {
				tom[i] = s.charAt(i);
				jerry[i] = s.charAt(i + 6);
			}
			int[] tomArray = new int[26];
			int[] jerryArray = new int[26];

			for (int i = 0; i < 5; i++) {
				tomArray[tom[i] - 'A']++;
				jerryArray[jerry[i] - 'A']++;
			}
			int tomindex = 0;
			int tomnum = 0;
			int jerryindex = 0;
			int jerrynum = 0;
			for (int i = 0; i < 26; i++) {
				if (tomnum <= tomArray[i]) {
					tomindex = i;
					tomnum = tomArray[i];
				}
				if (jerrynum <= jerryArray[i]) {
					jerryindex = i;
					jerrynum = jerryArray[i];
				}
			}

			if (tomnum > jerrynum) {
				System.out.println("Tom");
			} else if (tomnum < jerrynum) {
				System.out.println("Jerry");
			} else {
				if (tomindex > jerryindex) {
					System.out.println("Tom");
				} else if (tomindex < jerryindex) {
					System.out.println("Jerry");
				} else {
					System.out.println("Draw");
				}
			}

		}
	}
}
