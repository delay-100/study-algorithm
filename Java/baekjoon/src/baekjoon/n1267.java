package baekjoon;

import java.util.Scanner;

public class n1267 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int ynum = 0, mnum = 0;
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = input.nextInt();
			
			ynum += ((list[i]/30)+1)*10;
			mnum += ((list[i]/60)+1)*15;
			
		}

		if (ynum > mnum)
			System.out.println("M " + mnum);
		else if (ynum < mnum)
			System.out.println("Y " + ynum);
		else if (ynum == mnum)
			System.out.println("Y M " + mnum);
		input.close();
	}
}
