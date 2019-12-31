package baekjoon;

import java.util.Scanner;

public class n4344 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, num;
		double sum=0, count=0;
		n = input.nextInt();
		
		int[] list = new int[1000];
		double[] aver = new double[n];
		double[] percent = new double[n];

		
		for(int i=0; i<n; i++) {
			sum=0;
			count=0;
			num = input.nextInt();
			for(int j=0; j<num; j++) {
				list[j] = input.nextInt();
				sum +=list[j];
			}
			aver[i] = sum/num;
			for(int j=0; j<num; j++) {
				if(list[j] > aver[i]) {
					count++;
				}
			}
			percent[i] = (count/num)*100;
		}
	
		for(int i=0; i<n; i++) {
			System.out.print(String.format("%.3f", percent[i]));
			System.out.println("%");
		}
		
		input.close();
	}
}
