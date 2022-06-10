package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class p33 {
	static Node[] list;
	static int n, k;
	static ArrayList<String> ss;

	public static void depthSearch(int a, String s) {
		list[a].visitedGoTrue();

		list[a].plusgo();
		if (a == k && list[a].howgo() == k) {
			return;
		} else {
			System.out.println("--[a]--" + a);
			for (int i = 1; i < n + 1; i++) {
				System.out.print("list[" + i + "].true?=" + list[i].visited() + " ");
			}
			System.out.println();

			for (int i = 0; i < list[a].listsize(); i++) {
				if (!list[list[a].checkNum(i)].visited())
					depthSearch(list[a].checkNum(i), s + list[a].checkNum(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		int m = input.nextInt();
		k = input.nextInt();
		ss = new ArrayList<String>();
		list = new Node[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new Node(i);
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
		depthSearch(k, "");

		for (int i = 0; i < ss.size(); i++)
			System.out.println(ss.get(i));
		input.close();
	}

}
class Node {
	boolean visited;
	boolean root;
	int own;
	int num;
	ArrayList<Integer> alist;

	public Node(int own) {
		this.visited = false;
		this.own = own;
		this.root = false;
		this.num = 0;
		this.alist = new ArrayList<Integer>();
	}

	public void trueRoot() {
		this.root = true;
	}

	public boolean isroot() {
		return root;
	}

	public void plusgo() {
		this.num = this.num + 1;
	}

	public int howgo() {
		return this.num;
	}

	public void addlist(int a) {
		alist.add(a);
	}

	public int listsize() {
		return alist.size();
	}

	public int checkNum(int index) {
		return alist.get(index);
	}

	public void visitedGoTrue() {
		this.visited = true;
	}

	public boolean visited() {
		return visited;
	}

	public int own() {
		return own;
	}
}
