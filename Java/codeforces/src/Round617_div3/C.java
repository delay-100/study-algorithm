package Round617_div3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			String s = input.next();
			Map<Long, Integer> map = new HashMap<>();
			map.put(0L, 0);

			int a = 0, b = 0;
			int x = -1, y = 200000;

			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == 'L')
					a--;
				else if (s.charAt(j) == 'R')
					a++;
				else if (s.charAt(j) == 'U')
					b++;
				else if (s.charAt(j) == 'D')
					b--;

				Long key = 1234567L * a + b;

				if (!map.containsKey(key)) {
					map.put(key, j + 1);
				} else {
					int xx = map.get(key);
					int yy = j;
					if (y - x > yy - xx) {
						y = yy + 1;
						x = xx + 1;
					}
					map.put(key, j + 1);
				}

			}

			if (x == -1)
				System.out.println(-1);
			else
				System.out.println(x + " " + y);
		}

		input.close();
	}
}