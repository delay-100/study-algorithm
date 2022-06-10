package week12;

import java.util.Scanner;

public class p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int w = 0; w < t; w++) {
			int n = input.nextInt();
			int e = input.nextInt();

			int[][] graph = new int[n][n];

			for (int i = 0; i < e; i++) {
				int a = input.nextInt() - 1;
				int b = input.nextInt() - 1;
				int c = input.nextInt();

				graph[a][b] = c;
				graph[b][a] = c;
			}

			int startNode = input.nextInt() - 1;
			int midNode = input.nextInt() - 1;
			int FinNode = input.nextInt() - 1;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(graph[i][j] + " ");
				}
				System.out.println();
			}

			int[] distance = new int[n];

			for (int i = 0; i < n; i++) {
				if (graph[midNode][i] == 0)
					distance[i] = 1000;
				else
					distance[i] = graph[midNode][i];
			}

			distance[midNode] = 0;

			boolean[] visited = new boolean[n];
			// index가 mid를 기준으로 index가 0~4인 경우 최단거리를 distance배열에 입력

			int index = midNode; // 2
			visited[index] = true;

			for (int q = 0; q < n - 1; q++) {
				int min_in = 1000;
				int min_index = 0;
				for (int j = 0; j < n; j++) {
					if (!visited[j] && min_in > distance[j]) {
						min_in = distance[j];
						min_index = j;
					}
				}

				for (int j = 0; j < n; j++) {
					if (!visited[j] && graph[index][j] >= 1 && distance[j] > distance[index] + graph[index][j]) {
						distance[j] = distance[index] + graph[index][j];
					}
				}
				index = min_index;
				visited[index] = true;
			}

			System.out.println();
			for(int i=0; i<n; i++)
				System.out.print(distance[i]+" ");
			System.out.println();

			if (distance[startNode] + distance[FinNode] >= 1000)
				System.out.println(-1);
			else
				System.out.println(distance[startNode] + distance[FinNode]);
		}

		input.close();
	}
}