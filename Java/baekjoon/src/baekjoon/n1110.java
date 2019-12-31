package baekjoon;

import java.util.Scanner;

public class n1110 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, count =0,temp=0;
		
		n = input.nextInt();
		while(true) {
			if(temp ==0) {
				temp = n;
			}
			temp = (temp%10)*10+(temp/10 + temp%10)%10;
			count++;
			if(n==temp)
				break;
			
		}
		
		System.out.println(count);
		
		input.close();
	}
}
