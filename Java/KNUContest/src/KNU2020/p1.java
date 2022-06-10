package KNU2020;

import java.util.ArrayList;

public class p1 {
	public static void main(String[] args) {
		int[][] v = new int[3][2];
		int[] answer = {};
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		int m = 0;
		int n = 0;
		for(int i=0; i<v.length; i++) {
			if(!a.contains(v[i][0])) {
				a.add(v[i][0]);
			}
			else {
				m = v[i][0];
			}
			if(!b.contains(v[i][1])) {
				b.add(v[i][1]);
			}
			else {
				n = v[i][1];
			}
			
		}
		
		answer[0] = m;
		answer[1] = n;
		
	}
}
