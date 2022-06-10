package KNU2020;

import java.util.ArrayList;

public class p1_jin {
	public static void main(String[] args) {
		int[][] seat = new int[9999][9999];
		ArrayList<Double> a = new ArrayList<Double>();
		int answer = 0;
		for (int i = 0; i <3; i++) {
			seat[i][0] = i;
			seat[i][1] = i;
		}
		for (int i = 0; i < seat.length; i++) {
			double temp = 0;
			temp = seat[i][0] * (0.00000001) + seat[i][1];
			if (!a.contains(temp)) {
				a.add(temp);
				answer++;
			}
		}
		System.out.println(answer);
	}
}
