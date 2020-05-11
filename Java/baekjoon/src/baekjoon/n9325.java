package baekjoon;

import java.util.Scanner;

public class n9325 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		for(int i=0; i<n; i++) {
			int account = input.nextInt();
			int optionNum = input.nextInt();
			
			if(optionNum ==0);
			else {
				for(int j=0; j<optionNum; j++) {
					int opNum = input.nextInt();
					int opAccount = input.nextInt();
					account+=opNum*opAccount;
				}
			}
			System.out.println(account);
		}
		
		input.close();
	}
}
