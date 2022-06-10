package week9;

import java.util.Scanner;

public class p1_1 {

	static int NMAX = 100;
	static boolean finished = false;
	static int MAXCANDIDATES = 1000;
	static int ncandidates;
	static int solution_count;
	public static int N;
	public static int[] list;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		N = input.nextInt();
		nqueens(N);
		input.close();
	}

	public static void nqueens(int n) {
		int[] a = new int[NMAX];
		solution_count = 0;
		backtrack(a, 0, n);
		System.out.println("n=" + n + " solution_count=" + solution_count);
	}

	public static void backtrack(int[] a, int k, int input) {
		System.out.println("backtrack(a,"+ k + ", "+input+") called:");
		
		int[] c = new int[MAXCANDIDATES];
		int i;
		if (is_a_solution(a, k, input))
			process_solution(a, k);
		else {
			k = k + 1;
			construct_candidates(a, k, input, c);
			System.out.println("construct_candidates(a,"+k+","+input+", c,"+ncandidates+")");
			printa(a, k);
			for (i = 0; i < ncandidates; i++) {
				a[k] = c[i];
				backtrack(a, k, input);
				if (finished)
					return;
			}
		}
	}

	private static void process_solution(int[] a, int k) {
		solution_count++;
		System.out.println("solution_count(k=" + k + ")=" + solution_count);
	}

	private static void construct_candidates(int[] a, int k, int n, int[] c) {
		int i, j;
		boolean legal_move;
		ncandidates = 0;
		for (i = 1; i <= n; i++) {
			legal_move = true;
			for (j = 1; j < k; j++) {
				if (Math.abs((k) - j) == Math.abs(i - a[j])) {
					legal_move = false;
				}
				if (i == a[j])
					legal_move = false;
			}
			if (legal_move) {
				c[ncandidates] = i;
				ncandidates = ncandidates + 1;
			}
		}

	}

	public static void printa(int a[], int k) {
		int i;
		System.out.print("a[" + k + "] = {");
		for (i = 1; i <= k; i++)
			if (a[i] >= 1 && a[i] <= N)
				System.out.print(" " + a[i]);
		System.out.println("}");
	}

	public static boolean is_a_solution(int a[], int k, int n) {
		return (k == n);
	}

}
