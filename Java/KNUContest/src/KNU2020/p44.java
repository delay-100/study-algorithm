package KNU2020;

import java.util.ArrayList;
import java.util.Collections;

public class p44 {
	public static void main(String[] args) {

		int[] t1 = { 9, 4, 4, 4, 7 };
		int[] t2 = { 2, 10, 7, 6, 3 };
		int n = 10;
		int[] answer = {};
		int size = t1.length;
		int[] list = new int[500001];

		for (int i = 0; i < size; i++) {
			int temp1 = t1[i];
			int temp2 = t2[i];

			// temp1이 더 작은거
			if (temp2 < temp1) {
				int temp = temp1;
				temp1 = temp2;
				temp2 = temp;
			}
			if ((list[temp1] == 0) && (list[temp2] == 0)) {
				list[temp1] = temp1;
				list[temp2] = temp1;
			} else if (list[temp1] != 0 && list[temp2] == 0) {
				list[temp2] = list[temp1];
			} else if (list[temp2] != 0 && list[temp1] == 0) {
				list[temp1] = list[temp2];
			}

		}
		
//		System.out.println("list=");
//		for (int i = 1; i < n+1; i++) {
//		System.out.print(list[i]+" ");
//	}
//		System.out.println();
		ArrayList<Integer> ans = new ArrayList<Integer>();

		for (int i = 1; i < n + 1; i++) {

//			System.out.print(list[i] + " ");
			if (list[i] == 0) {
				ans.add(i);
			} else if(list[i]==i){
				ArrayList<Integer> tempa = new ArrayList<Integer>();
				tempa.add(i);
				for (int j = i+1; j < n + 1; j++) {
					if (list[i] == list[j]) {
						tempa.add(j);
						list[j] = -1;
					}
				}
				Collections.sort(tempa);
				int tempaa = tempa.size() / 2;
				ans.add(tempa.get(tempaa-1));
				list[i] = -1;
			}
		}
//		System.out.println("list=");
//		for (int i = 1; i < n+1; i++) {
//		Syst]]em.out.print(list[i]+" ");
//	}
//		System.out.println();
		Collections.sort(ans);
//		System.out.println("ans.size()"+ans.size());
//		for (int i = 0; i < ans.size(); i++) {
//			System.out.println(ans.get(i));
//		}
		answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++) {
			answer[i] = ans.get(i);
			System.out.print(answer[i]+" ");
		}

	}
}
