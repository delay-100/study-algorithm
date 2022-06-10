package Round627_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		long[] list1 = new long[t];
		long[] list2 = new long[t];
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			list1[i] = input.nextLong();
		}
		for (int i = 0; i < t; i++) {
			list2[i] = input.nextLong();
		}
		long num = 0;

		for (int i = 0; i < t; i++) {
			list.add(list1[i] - list2[i]); 
		}

		Collections.sort(list);
		int size = list.size()-1;
		int i=0;
		while(i<size) {
			if(list.get(size)+list.get(i)>0) {
				num += size-i;
				size--;
			}
			else
				i++;
		}

		System.out.println(num);

		input.close();
	}
}
