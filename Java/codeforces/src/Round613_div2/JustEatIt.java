package Round613_div2;

import java.util.Scanner;

public class JustEatIt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String[] s = new String[n];
		
		for(int i=0; i<n; i++) {
			int a = input.nextInt();
			for(int j=0; j<a; j++) {
				int temp = input.nextInt();
				if (a == 1 ||temp <=0)
					s[i] = "NO";
			}
			if(s[i]==null)
				s[i]= "YES";
		}
		
		for(int i=0; i<n; i++){
			System.out.println(s[i]);
		}
		
		input.close();
	}
}
