package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class p3_1 {
	static Node2[] list;
	static int n, k;
	static ArrayList<String> ss;
	
	public static void depthSearch(int a, boolean[] visited, String s) {
		System.out.println("a="+a);
		System.out.println("s="+s);
		System.out.println();
		visited[a] = true;
		list[a].plusgo(); // 2 == +1
//		System.out.println(s);
		boolean isok = true;

		for(int i=1; i<visited.length; i++) {
			if(!visited[i]) {
				isok = false;
			}
		}
		if (list[a].isroot() && list[a].howgo() == 2&&isok) {
			System.out.println("zzs");
			ss.add(s);
//				for (int i = 1; i < n + 1; i++) {
//					list[i].visitedGofalse();
//					list[i].cleargo();
//				}
//				System.out.println(s);
//				s = "";
//				System.out.println();

			return;
		}
//		else {
		for (int i = 0; i < list[a].listsize(); i++) { // i=1 // i=2
//				System.out.println(s + a);
			if (!visited[list[a].checkNum(i)] || list[list[a].checkNum(i)].isroot())
				depthSearch(list[a].checkNum(i), visited, s + a); // a=1 s = 2 //
		}
//		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		boolean[] visited = new boolean[n + 1];
		int m = input.nextInt();
		k = input.nextInt();
		ss = new ArrayList<String>();
		list = new Node2[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new Node2(i);
			if (k == i) {
				list[i].trueRoot();
			}
		}

		for (int i = 0; i < m; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			list[a].addlist(b);
			list[b].addlist(a);
		}

		depthSearch(k, visited, "");

		for (int i = 0; i < ss.size(); i++)
			System.out.println(ss.get(i));
		
		input.close();
	}

}



class Node2 {
	boolean visited;
	boolean root;
	int own;
	int num;
	ArrayList<Integer> alist;

	public Node2(int own) {
		this.visited = false;
		this.own = own;
		this.root = false;
		this.num = 0;
		this.alist = new ArrayList<Integer>();
	}

	public void visitedGoTrue() {
		this.visited = true;
	}

	public void visitedGofalse() {
		this.visited = false;
	}

	public void plusgo() {
		this.num = this.num + 1;
	}

	public int howgo() {
		return this.num;
	}

	public void cleargo() {
		num = 0;
	}

	public boolean visited() {
		return visited;
	}

	public void trueRoot() {
		this.root = true;
	}

	public boolean isroot() {
		return root;
	}

	public void addlist(int a) {
		alist.add(a);
	}

	public int listsize() {
		return alist.size();
	}

	public boolean ishave(int a) {
		if (alist.contains(a))
			return true;
		else
			return false;
	}

	public int checkNum(int index) {
		return alist.get(index);
	}

	public int own() {
		return own;
	}

}
