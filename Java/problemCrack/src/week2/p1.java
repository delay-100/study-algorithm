package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			char[] list = s.toCharArray();
			Queue<Character> opqueue = new LinkedList<Character>();
			Queue<Integer> numqueue = new LinkedList<Integer>();

			StringBuilder num = new StringBuilder();
			for (int i = 0; i < list.length; i++) {
				if ((list[i] >= 65) && (list[i] <= 74)) {
					num.append(list[i] - 'A');
					continue;
				}
				opqueue.add(list[i]);
				if (num.length() != 0) {
					numqueue.add(Integer.parseInt(num.toString()));
					num.setLength(0);
				}
			}
			if (num.length() != 0)
				numqueue.add(Integer.parseInt(num.toString()));

			if (opqueue.size() + 1 == numqueue.size()) {
				int sum = numqueue.poll();
				while (!opqueue.isEmpty()) {
					int nuum = numqueue.poll();
					char oper = opqueue.poll();
					if (oper == 'P') {
						sum += nuum;
					} else if (oper == 'S') {
						sum -= nuum;
					} else if (oper == 'T') {
						sum *= nuum;
					} else if (oper == 'V') {
						sum /= nuum;
					}
				}
				System.out.println(sum);
			} else {
				System.out.println("Error");
			}

		}
	}
}
