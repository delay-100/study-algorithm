package KNU2020;

import java.util.ArrayList;

public class p4 {
	public static void main(String[] args) {

		int[] t1 = { 9, 4, 4, 4, 7 };
		int[] t2 = { 2, 10, 7, 6, 3 };
		solution(10, t1, t2);
	}

	public static int[] solution(int n, int[] t1, int[] t2) {
		int[] answer = {};
		int size = t1.length;
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			int temp1 = t1[i];
			int temp2 = t2[i];
			boolean istrue = false;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).contains(temp1) || (list.get(j).contains(temp2))) {
//					list2 = list.;
					list2.add(temp1);
					list2.add(temp2);
					list.add(j, list2);
					istrue = true;
				}
			}
			if (!istrue) {
				list2 = new ArrayList<Integer>();
				list2.add(temp1);
				list2.add(temp2);
				list.add(list2);
			}

		}

		for (int i = 0; i < list.size(); i++) {
			int temp = list.get(i).size();
			for (int j = 0; j < temp; j++) {
				System.out.print(list.get(i).get(j) + " ");
			}
			System.out.println();
		}

		return answer;
	}
}
