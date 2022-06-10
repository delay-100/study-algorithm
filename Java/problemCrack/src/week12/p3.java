package week12;

import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (input.hasNextInt()) {
			int x = input.nextInt();
			int y = input.nextInt();
			int d = input.nextInt();
			int t = input.nextInt();
			int[][] graph = new int[y][x];

			for (int i = 0; i < y; i++) {
				String s = input.next();
				char[] c = new char[x];
				c = s.toCharArray();
				for (int j = 0; j < x; j++) {
					graph[i][j] = c[j] - 'A';
				}
			}

//			for (int i = 0; i < y; i++) {
//				for (int j = 0; j < x; j++) {
//					System.out.print(graph[i][j] + " ");
//				}
//				System.out.println();
//			}

			int[] graphOne = new int[x * y];

			int temp = 0;

			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					graphOne[temp] = graph[i][j];
					temp++;
				}
			}

//			System.out.println("graphOne");
//			for (int i = 0; i < x * y; i++) {
//				System.out.print(graphOne[i] + " ");
//			}
//			System.out.println();
//			System.out.println();
			int[][] graph2 = new int[x * y][x * y];

			for (int i = 0; i < x * y; i++) {
				for (int j = 0; j < x * y; j++) {
					graph2[i][j] = 1000;
				}
			}

			int[] dx = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
			int[] dy = { -1, -1, -1, 0, 0, 0, 1, 1, 1 };

			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {

					for (int k = 0; k < 9; k++) {
						int d_x = i + dx[k];
						int d_y = j + dy[k];

						if (d_x == i && d_y == j) {
							graph2[i * x + j][i * x + j] = 0;
						} else if (d_x >= 0 && d_x < x && d_y >= 0 && d_y < y) {

							if (graphOne[x * d_x + d_y] > graphOne[i * x + j]) {
								if (graphOne[x * d_x + d_y] - graphOne[i * x + j] <= d) {
									graph2[i * x + j][x * d_x + d_y] = (graphOne[x * d_x + d_y] - graphOne[i * x + j])
											* (graphOne[x * d_x + d_y] - graphOne[i * x + j]);
								}
							} else {
								if ( graphOne[i * x + j]- graphOne[x * d_x + d_y] <= d) {
									graph2[i * x + j][x * d_x + d_y] = 1;
								}
							}
						}

					}
				}
			}

//			for (int i = 0; i < x * y; i++) {
//				for (int j = 0; j < x * y; j++) {
//					System.out.print(graph2[i][j] + " ");
//				}
//				System.out.println();
//			}

			int[][] distance = new int[x * y][x * y];

			for (int i = 0; i < x * y; i++) {
				for (int j = 0; j < x * y; j++) {
					distance[i][j] = graph2[i][j];
				}
			}

			for (int i = 0; i < x * y; i++) {
				boolean[] visited = new boolean[x * y];

				int index = i;
				visited[index] = true;

				for (int q = 0; q < x * y - 1; q++) {
					int min_in = 1000;
					int min_index = 0;

					for (int j = 0; j < x * y; j++) {
						if (!visited[j] && min_in > distance[i][j]) {
							min_in = distance[i][j];
							min_index = j;
						}
					}

					index = min_index;
					visited[index] = true;
					for (int j = 0; j < x * y; j++) {
						if (!visited[j] && graph2[index][j] >= 1
								&& distance[i][j] > distance[i][index] + graph2[index][j]) {
							distance[i][j] = distance[i][index] + graph2[index][j];
						}
					}
				}
			}

//			System.out.println();
//			System.out.print("  ");
//			for (int i = 0; i < x * y; i++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			for (int i = 0; i < x * y; i++) {
//				System.out.print(i + " ");
//				for (int j = 0; j < x * y; j++)
//					System.out.print(distance[i][j] + " ");
//				System.out.println();
//			}

			int depth = 0;

			for (int i = 0; i < x * y; i++) {
				if (depth<graph[i/x][i%x]&&distance[0][i] + distance[i][0] <= t) {
//					System.out.println("i="+i+" graphOne[i]="+graphOne[i]);
//					System.out.print("distance[0]["+i+"]="+distance[0][i]);
//					System.out.println(" distance["+i+"][0]="+distance[i][0]);
					
					depth = graph[i/x][i%x];
				}
			}
			System.out.println(depth);
		}
		
		input.close();
	}
}
