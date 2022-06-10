package Round615_div3;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			long[] list = new long[3];
			for(int j=0; j<3; j++) {
				list[j] = input.nextLong();
			}
			Arrays.sort(list);
			int n = input.nextInt();
			
			n -= (list[2]-list[0])+(list[2]-list[1]);
			
			if(n>=0&&n%3==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		
		input.close();
	}
}
