package week11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class p3 {
	public static int[][] graph;
	public static ArrayList<Integer> dfs;
	static Node3[] dfsNode3;
	static int n;
	static Stack<Integer> st;

	public static void depthFirstSearch(int first, int a) {

		st.push(first);
		dfsNode3[first].visitedplus();
		dfsNode3[first].visitedGoTrue();
//		dfs.add(first);

//		System.out.println(dfsNode3[first].visitedNum());
		System.out.println(first);
		if (first == a&&dfsNode3[first].visitedNum()==1) {

			for(int i=0; i<st.size(); i++) {
				System.out.println(st.elementAt(i)+" ");
			}
			st.pop();
			dfsNode3[first].visitedone();
			return;
		}
		for (int i = 0; i < n; i++) {
			if ((graph[first][i] == 1) && (!dfsNode3[i].visited())) {
				depthFirstSearch(i, a);
				dfsNode3[i].visitedGoFalse();
			}

		}
		st.pop();
	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		st = new Stack<Integer>();
		dfsNode3 = new Node3[n];
		dfs = new ArrayList<Integer>();

		for (int j = 0; j < n; j++) {
			dfsNode3[j] = new Node3(j);
		}

		graph = new int[n][n];

		int m = input.nextInt();
		for (int j = 0; j < m; j++) {
			int token1 = input.nextInt() - 1;
			int token = input.nextInt() - 1;

			graph[token1][token] = graph[token][token1] = 1;

		}

		int k = input.nextInt() - 2;
		System.out.println(k);
//		graph[k-1][k-1] =2;

		depthFirstSearch(k, k);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < dfs.size(); i++) {
			System.out.print(dfs.get(i) + 1);
			if (i != dfs.size() - 1)
				System.out.print(" ");
		}
		input.close();
	}

}

class Node3 {
	boolean visited;
	int own;
	int num;

	public Node3(int own) {
		visited = false;
		this.own = own;
		this.num = 0;
	}

	public void visitedone() {
		num = 0;
	}

	public void visitedplus() {
		num = num+1;
	}

	public int visitedNum() {
		return num;
	}

	public void visitedGoTrue() {
		this.visited = true;
	}

	public void visitedGoFalse() {
		this.visited = false;
	}

	public boolean visited() {
		return visited;
	}

	public int own() {
		return own;
	}

}
