package Round644_div3;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = "";

			boolean contain = false;
			for (int j = 0; j < n; j++) {
				s += input.next();
				if (s.contains("1"))
					contain = true;
			}

			boolean istrue = true;
			if (contain == true) {
				String[] list = s.split("");
				for (int j = 0; j < n * n - n; j++) {
					if ((j + 1) % n == 0)
						;
					else {
						if (list[j].equals("1") && (list[j + 1].equals("0")) && (list[j + n].equals("0"))) {
							istrue = false;
							break;
						}
					}
				}
			}
			if (istrue == true)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		input.close();
	}
}
