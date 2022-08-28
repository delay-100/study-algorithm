package todayStudy;

import java.util.Scanner;

public class n2812 {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int K = input.nextInt();
		
		String num = input.next();
		
		String[] templist = num.split("");
		int[] list = new int[N];
		int temp = list[0];
		
		for(int i=0; i<N; i++) {
			list[i] = Integer.parseInt(templist[i]);
		}
		
		
		input.close();
	}
}
