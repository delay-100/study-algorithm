package week10;

import java.util.Scanner;

public class p3 {
	public static int[][] graph;
	static Node[][] dfsnode;
	static int[][] list;
	static int N;
	static int count;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void depthSearch(int x, int y) {
		dfsnode[x][y].visitedGoTrue();

		for (int i = 0; i < 4; i++) {
			int d_x = x + dx[i];
			int d_y = y + dy[i];

			if (d_x >= 0 && d_x < N && d_y >= 0 && d_y < N) {
				if (!dfsnode[d_x][d_y].visited() && graph[d_x][d_y] == 1) {
					list[d_x][d_y] = count;
					depthSearch(d_x, d_y);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		N = input.nextInt();
		dfsnode = new Node[N][N];
		list = new int[N][N];
		count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				dfsnode[i][j] = new Node(i, j);
			}
		}
		graph = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				graph[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!dfsnode[i][j].visited() && graph[i][j] == 1) {
					count++;
					list[i][j] = count;
					depthSearch(i, j);
				}

			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}

	static class Node {
		boolean visited;
		int x, y;

		public Node(int x, int y) {
			visited = false;
			this.x = x;
			this.y = y;
		}

		public void visitedGoTrue() {
			this.visited = true;
		}

		public boolean visited() {
			return visited;
		}

		public int x() {
			return x;
		}

		public int y() {
			return y;
		}
	}

}
