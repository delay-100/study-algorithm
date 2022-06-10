package week10;

import java.util.Scanner;

public class p3_1 {

	static int[][] graph;
	static int N;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		N = input.nextInt();
		
		graph = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				graph[i][j] = input.nextInt();
			}
		}
		
		
		
		
		input.close();
	}
}
