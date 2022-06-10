package week11;

import java.util.ArrayList;
import java.util.Scanner;

public class p3_2 {
	static Node5[] list;
	static int n, k;
	static ArrayList<String> ss;

	public static void depthSearch(int a, String s) {
		
		for(int i=0; i<list[a].listsize(); i++) {
			
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		int m = input.nextInt();
		k = input.nextInt();
		
		ss = new ArrayList<String>();
		list = new Node5[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list[i] = new Node5(i);
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

class Node5 {
	boolean visited;
	boolean root;
	int own;
	int num;
	ArrayList<Integer> alist;

	public Node5(int own) {
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
