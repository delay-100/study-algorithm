package Round611_div3;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			
			int exceed = k/2; // 2
			
			int nn = (n/k)*k; //16
			int nnn = n%k; // 3
			
			if(nnn<=exceed) {
				System.out.println(nn+nnn);
			}
			else {
				System.out.println(nn+exceed);
			}
			
			
		}
		
		input.close();
	}
}
