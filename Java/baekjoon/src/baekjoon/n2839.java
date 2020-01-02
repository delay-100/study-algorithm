package baekjoon;

import java.util.Scanner;

public class n2839 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int n=0;
		
		while(true) {
			if(a % 5 ==0){
				n = n + a/5;
				System.out.println(n);
				break;
			}
			
			a= a-3;
			n++;
			
			if(a <0) {
				System.out.println(-1);
				break;
			}
		}
		input.close();
	}

}
