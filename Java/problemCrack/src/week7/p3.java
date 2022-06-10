package week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p3 {
	static List<Integer> num;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] list = new int[n];
		num = new ArrayList<Integer>();
		fibo(11);
		for (int i = 0; i < n; i++) {
			list[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int result = 0;
			for(int j=num.size()-1; j>=0; j--) {
				if(list[i]>=num.get(j)) {
					list[i] -= num.get(j);
					result += num.get(j)*num.get(j);
				}
			}
			System.out.println(result);
		}
		


		input.close();
	}

	public static void fibo(int n) {
		int n1 = 0;
		int n2 = 1;
		int result = 0;

		for (int i = 0; i < n - 1; i++) {
			result = n1 + n2;
			n1 = n2;
			n2 = result;
			num.add(result);
		}
	}
}
