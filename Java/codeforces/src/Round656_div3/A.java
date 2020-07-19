package Round656_div3;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			long[] list = new long[3];
			
			list[0] = input.nextLong();
			list[1] = input.nextLong();
			list[2] = input.nextLong();
			
			Arrays.sort(list);
			
			if(list[1]==list[2]) {
				System.out.println("YES");
				System.out.println(list[0]+" "+list[0]+" "+list[1]);
			}
			else {
				System.out.println("NO");
			}
			
			
			
		}
		
		input.close();
	}
}
