package week11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class P3__2 {
	public static int[][] graph;
	static int n, m, k;

	public static void depthFirstSearch(int first, ArrayList<Integer> list, boolean[] visited) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			temp.add(list.get(i));
		}

		visited[first] = true;

		list.add(first + 1);
		boolean istrue = true;
		for (int i = 0; i < n; i++) {
			if (!visited[i])
				istrue = false;
		}
		if (istrue && graph[first][k] == 1) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.print(k + 1);
			System.out.println();
//			list.clear();

			return;
		} else if (istrue && graph[first][k] == 0 && list.size() - 1 == n) {
			System.out.println(0);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (graph[first][i] == 1 && !visited[i]) {
				depthFirstSearch(i, list, visited);
				visited[i] = false;

			}
		}
		list.clear();
		for (int j = 0; j < temp.size(); j++) {
			list.add(temp.get(j));
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		k = input.nextInt() - 1;

		graph = new int[n][n];

		for (int i = 0; i < m; i++) {
			int a = input.nextInt() - 1;
			int b = input.nextInt() - 1;

			graph[a][b] = 1;
			graph[b][a] = 1;
		}

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++)
//				System.out.print(graph[i][j] + " ");
//			System.out.println();
//		}

		boolean[] visited = new boolean[n];
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (n > m)
			System.out.println(0);
		else
			depthFirstSearch(k, list, visited);

		input.close();
	}

}
