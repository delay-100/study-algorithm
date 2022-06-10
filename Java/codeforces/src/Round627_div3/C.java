package Round627_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			String s = input.next();
			String[] list = s.split("");
			int d = 0;
			int temp = 0;
			for (int j = 0; j < list.length; j++) {
				if (list[j].equals("L")) {
					d++;
				} else {
					if (d > temp)
						temp = d;
					d = 0;
					
				}
			}
			if (d > temp)
				temp = d;
			System.out.println(temp + 1);
		}

		input.close();
	}
}
