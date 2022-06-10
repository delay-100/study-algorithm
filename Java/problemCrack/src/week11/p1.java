package week11;

import java.util.*;

public class p1 {
	static int n;
	static int m;
	static int graph[][];
	static int colorlist[];
	static int list[][];
	static int num;

	public static void depthSearch(int a) {
		boolean istrue = true;

		for (int j = 0; j < a; j++) {
			if (istrue) {
				if (graph[a][j] == 1 && colorlist[a] == colorlist[j])
					istrue = false;
			}
		}
		if (istrue) // 0
			if (a == n - 1) {
				for (int j = 0; j < n; j++) {
					System.out.print(colorlist[j] + " ");
					list[num][j] = colorlist[j];
				}
				System.out.println();
				num++;
			} else {
				for (int C = 1; C < m + 1; C++) {
					colorlist[a + 1] = C;
					depthSearch(a + 1);
				}
			}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		graph = new int[n][n];
		colorlist = new int[n];
		colorlist[0] = 1;
		list = new int[10000][n];
		num = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = input.nextInt();
			}
		}
		depthSearch(0);
		ArrayList<Long> zz = new ArrayList<Long>();

		if (num == 0) {
			System.out.println("NONE");
		} else {
			if (m == 2) {
				for (int i = 0; i < num; i++) {
					StringBuilder temp = new StringBuilder();
					for (int j = 0; j < n; j++) {
						if (list[i][j] == 1) {
							temp.append("2");
						} else if (list[i][j] == 2) {
							temp.append("1");
						}
					}
					zz.add(Long.parseLong(temp.toString()));
				}
			} else if (m == 3) {
				// 시작이 2인경우
				for (int i = 0; i < num; i++) {
					StringBuilder temp = new StringBuilder();
					for (int j = 0; j < n; j++) {
						if (list[i][j] == 1) {
							temp.append("2");
						} else if (list[i][j] == 2) {
							temp.append("1");
						} else if (list[i][j] == 3) {
							temp.append("3");
						}
					}

					zz.add(Long.parseLong(temp.toString()));
				}
				// 시작이 3인경우
				for (int i = 0; i < num; i++) {
					StringBuilder temp = new StringBuilder();
					for (int j = 0; j < n; j++) {
						if (list[i][j] == 1) {
							temp.append("3");
						} else if (list[i][j] == 2) {
							temp.append("1");
						} else if (list[i][j] == 3) {
							temp.append("2");
						}
					}

					zz.add(Long.parseLong(temp.toString()));
				}
			}
			Collections.sort(zz);
			for (int i = 0; i < zz.size(); i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(zz.get(i).toString().charAt(j) + " ");
				}
				if (zz.size() - 1 != i)
					System.out.println();
			}
		}
		input.close();
	}
}
