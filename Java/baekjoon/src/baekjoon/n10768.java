package baekjoon;

import java.util.Scanner;

public class n10768 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month = input.nextInt();
		int day = input.nextInt();
		
		if(month==2 && day==18) {
			System.out.println("Special");
		}
		else if((month==2 && day<18)||(month<2)) {
			System.out.println("Before");
		}
		else {
			System.out.println("After");
		}
		
		input.close();
	}
}
