package Round661_div3;

import java.io.*;
import java.util.*;

public class cc {
	public static void main(String[] args) {
		InputReader in = new InputReader();
		StringBuilder out = new StringBuilder();

		int T = in.nextInt();
		int[] W = new int[123];
		while (T-- > 0) {
			int N = in.nextInt();
			Arrays.fill(W, 0);
			for (int i = 0; i < N; i++) {
				int x = in.nextInt();
				W[x]++;
			}
			int ans = 0;
			for (int i = 2; i < 101; i++) {
				int x = 0;
				for (int j = 1; j <= i - j; j++) {
					if (j == i - j) {
						x += W[j] / 2;
						break;
					}
					x += Math.min(W[j], W[i - j]);
				}
				ans = Math.max(ans, x);
			}
			out.append(ans).append('\n');
		}

		System.out.print(out);
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer st;

		public InputReader() {
			reader = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}

		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
