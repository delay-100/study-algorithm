package week11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class P3__1 {
	public static int[][] graph;
	public static ArrayList<Integer> dfs;
	static Node88[] dfsnode88;
	static int n, m, k, num;
	static Stack<Integer> st;

	public static void depthFirstSearch(int first) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(first);
		dfsnode88[first].visitedGoTrue();
		dfs.add(first);

		boolean temp2;

		while (!st.isEmpty()) {
			int temp = st.peek();

			temp2 = false;

			for (int i = 0; i < n; i++) {
				if ((graph[temp][i] == 1) && (!dfsnode88[i].visited())) {
					st.push(i);
					depthFirstSearch(i);
					dfs.add(i);
					dfsnode88[i].visitedGoTrue();
					temp2 = true;
					break;
				}
				
			}
			if (temp2 == false)
				st.pop();
		}

	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		m = input.nextInt();
		k = input.nextInt() - 1;
		num = 0;

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

		dfsnode88 = new Node88[n];
		dfs = new ArrayList<Integer>();
		for (int j = 0; j < n; j++) {
			dfsnode88[j] = new Node88(j);
		}

		depthFirstSearch(k);
//		ArrayList<Integer> temp = new ArrayList<Integer>();
//		boolean istrue = true;
//		for (int i = 0; i < dfs.size() / 2 + 1; i++) {
//			if (temp.contains(dfs.get(i))) {
//				istrue = false;
//			}
//			else {
//				temp.add(dfs.get(i));
//			}
//		}
//		temp = new ArrayList<Integer>();
//		for (int i = dfs.size()+1; i < dfs.size(); i++) {
//			if (temp.contains(dfs.get(i))) {
//				istrue = false;
//			}
//			else {
//				temp.add(dfs.get(i));
//			}
//		}
		
		System.out.println(dfs.size());
		for(int i=0; i<dfs.size(); i++) {
			System.out.print(dfs.get(i)+1+" ");
		}
//		
//		if (istrue && graph[dfs.get(dfs.size() - 1)][k] == 1) {
//			for (int i = 0; i < dfs.size() / 2 + 1; i++) {
//				System.out.print(dfs.get(i) + 1);
//				System.out.print(" ");
//				if (dfs.size() - 1 == i)
//					System.out.print(k + 1);
//
//			}
//
//			System.out.print(k + 1);
//			System.out.println();
//			System.out.print(k + 1 + " ");
//			for (int i = dfs.size() / 2 + 1; i < dfs.size(); i++) {
//				System.out.print(dfs.get(i) + 1);
//				System.out.print(" ");
//				if (dfs.size() - 1 == i)
//					System.out.print(k + 1);
//
//			}
//		} else
//			System.out.println(0);
		input.close();
	}

}

class Node88 {
	boolean visited;
	int own;
	int num;

	public Node88(int own) {
		visited = false;
		this.own = own;
		this.num = 0;
	}

	public void visitedone() {
		num = 0;
	}

	public void visitedplus() {
		num = num + 1;
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
