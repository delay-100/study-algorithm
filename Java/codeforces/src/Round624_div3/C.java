package Round624_div3;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int m = input.nextInt();
			char[] slist = new char[n];
			int[] nlist = new int[m];
			long[] list = new long[26];

			String s = input.next();
			slist = s.toCharArray();

			for (int j = 0; j < m; j++)
				nlist[j] = input.nextInt() - 1;

			long[] sum = new long[n];
			for (int j = 0; j < m; j++) {
				sum[nlist[j]]++;
			}
			sum[n-1]++;
			
			int temp = 0;
			for (int j = n-1; j >=0; j--) {
				if(sum[j]>0) {
					temp+=sum[j];
				}
				sum[j] = temp;
			}
			
			for (int j = 0; j < n; j++) {
				list[slist[j]-'0'-49] += sum[j];
			}
			
			int length = list.length;
			for (int j = 0; j < length; j++)
				System.out.print(list[j] + " ");
			System.out.println();
		}

		input.close();
	}
}
