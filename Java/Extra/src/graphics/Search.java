package graphics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Search {
	public static int[][] graph;
	public static ArrayList<Integer> dfs;
	public static ArrayList<Integer> bfs;
	static Node[] dfsnode;
	static Node[] bfsnode;
	static int num;

	public static void breadthFirstSearch(int first) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(first);
		bfsnode[first].visitedGoTrue();

		while (!q.isEmpty()) {
			first = q.poll();
			bfs.add(first);

			for (int i = 0; i < num; i++) {
				if ((graph[first][i] == 1) && ((bfsnode[i].visited() == false))) {
					q.add(i);
					bfsnode[i].visitedGoTrue();
				}
			}
		}
	}

	public static void depthFirstSearch(int first) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(first);
		dfsnode[first].visitedGoTrue();
		dfs.add(first);

		boolean temp2;

		while (!st.isEmpty()) {
			int temp = st.peek();

			temp2 = false;

			for (int i = 0; i < num; i++) {
				if ((graph[temp][i] == 1) && (dfsnode[i].visited() == false)) {
					st.push(i);
					dfs.add(i);
					dfsnode[i].visitedGoTrue();
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

		System.out.println("정렬하고 싶은 텍스트 파일의 이름을 입력하세요.");
		System.out.println("목록 : data.txt, data2.txt, data3.txt");

		String f = input.next();
		File file = new File(f);
		BufferedReader b = new BufferedReader(new FileReader(file));

		ArrayList<String> list = new ArrayList<String>();

		num = Integer.parseInt(b.readLine());

		StringBuilder sb = new StringBuilder("Node = {");

		for (int i = 0; i < num; i++) {
			sb.append(i);
			if (i != (num - 1))
				sb.append(", ");
		}
		sb.append("}");

		String line;
		while ((line = b.readLine()) != null) {
			if (line.equals(""))
				;
			else {
				list.add(line);
			}
		}

		dfsnode = new Node[num];
		bfsnode = new Node[num];
		dfs = new ArrayList<Integer>();
		bfs = new ArrayList<Integer>();

		for (int j = 0; j < num; j++) {
			dfsnode[j] = new Node(j);
			bfsnode[j] = new Node(j);
		}

		graph = new int[num][num];

		int size = list.size();
		for (int j = 0; j < size; j++) {
			line = list.get(j);
			StringTokenizer tk = new StringTokenizer(line, "-");
			String token;
			int i = 0;
			int token1 = 0;
			while (tk.hasMoreTokens()) {
				token = tk.nextToken();
				if (i == 0) {
					token1 = Integer.parseInt(token);
					i++;
				} else {
					graph[token1][Integer.parseInt(token)] = graph[Integer.parseInt(token)][token1] = 1;

					i = 0;
				}
			}
		}

		System.out.println("시작 노드를 선택해주세요 \n" + sb.toString());
		int first = input.nextInt();

		System.out.print("breadthFirstSearch : ");
		breadthFirstSearch(first);
		for (int i = 0; i < bfs.size(); i++) {
			System.out.print(bfs.get(i));
			if (i != bfs.size() - 1)
				System.out.print(" -> ");
		}

		System.out.println("\ndepthFirstSearch : ");
		depthFirstSearch(first);
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < dfs.size(); i++) {
			System.out.print(dfs.get(i));
			if (i != dfs.size() - 1)
				System.out.print(" -> ");
		}
		b.close();
		input.close();
	}
}
