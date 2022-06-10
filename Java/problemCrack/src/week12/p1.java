package week12;

import java.util.ArrayList;
import java.util.Scanner;

public class p1 {
	static int n;
	static int[][] graph;
	static int max;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		max = 0;
		graph = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = input.nextInt();
			}
		}

		boolean[] visited = new boolean[n];

		int index = 0; // 1
		visited[index] = true;
		ArrayList<Integer> array = new ArrayList<Integer>();
		// n¹ø µ¹¸²
		for (int q = 0; q < n; q++) {
			array.add(index);
			int max_in = 0;
			int max_index = 0;
			for(int u = 0; u<array.size(); u++) {
				for(int j=0; j<n; j++) {
					if(!visited[j]&&max_in<graph[array.get(u)][j]) {
						max_in = graph[array.get(u)][j];
						max_index = j;
					}
				}
			}
			
			max += max_in;
			index = max_index;
			visited[index] = true;
		}

		System.out.println(max);

		input.close();
	}

}
