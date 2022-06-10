package week14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String x = input.next();
		String y = input.next();

		int[][] list = new int[x.length()+1][y.length()+1];

		list[0][0] = 0;

		for (int j = 1; j < y.length()+1; j++) {
				list[0][j] = list[0][j - 1] + 2;
		}

		for (int i = 1; i < x.length()+1; i++) {
			list[i][0] = list[i - 1][0] + 3;
		}

		for (int i = 1; i < x.length()+1; i++) {
			for (int j = 1; j < y.length()+1; j++) {
				if(x.charAt(i-1)==y.charAt(j-1)) {
					list[i][j] = list[i-1][j-1];  
				}	
				else {
					list[i][j] = min(list[i-1][j-1]+1,list[i][j-1]+2, list[i-1][j]+3);  
				}
			}
		}

		for (int i = 0; i < x.length()+1; i++) {
			for (int j = 0; j < y.length()+1; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(list[x.length()][y.length()]);
		input.close();
	}

	private static int min(int i, int j, int k) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(i);
		list.add(j);
		list.add(k);
		Collections.sort(list);
		int num = list.get(0);
		return num;
	}
}
