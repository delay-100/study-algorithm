package Round644_div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(input.nextInt());
			}
			Collections.sort(list);
			int even = 0;
			// 짝수의 개수를 계산
			for (int j = 0; j < n; j++) {
				if (list.get(j) % 2 == 0)
					even++;
			}
			int no = 0;
			int temp = 0;
			if (even % 2 == 0)
				;
			else { 
				for (int j=1; j<n; j++) {
					if (list.get(j)==list.get(j-1)+1) {
						temp=1;
					}
				}
				if (temp==0) {
					System.out.println("NO");
					no = 1;
				}
			}
			
			if(no==0)
				System.out.println("YES");
		}

		input.close();
	}
}