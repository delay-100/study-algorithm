package Round624_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int anum = input.nextInt();
			int pnum = input.nextInt();
			int[] alist = new int[anum];
			int[] plist = new int[pnum];

			for (int j = 0; j < anum; j++) {
				alist[j] = input.nextInt();
			}
			for (int j = 0; j < pnum; j++) {
				plist[j] = input.nextInt() - 1;
			}
			while (true) {
				int ischange = 0;
				for (int j = 0; j < pnum; j++) {
					if (((alist[plist[j]] > alist[plist[j] + 1]) && ((plist[j] + 1) != anum))) {
						int temp = alist[plist[j]];
						alist[plist[j]] = alist[plist[j] + 1];
						alist[plist[j] + 1] = temp;
						ischange++;
					}
				}
				if (ischange == 0) {
					break;
				}
			}
			boolean istrue = true;
			for (int j = 0; j < anum - 1; j++) {
				if (alist[j] > alist[j + 1]) {
					istrue = false;
					break;
				}
			}

			if (istrue)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

		input.close();
	}
}
