package Round640_div4;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int t = input.nextInt();
		
		for(int i=0; i<t; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			StringBuilder sb = new StringBuilder();
			
			if(b== 0) {
				if(a>0) {
					for(int j=0; j<a+1; j++)
						sb.append("0");
				}
				else if(c>0) {
					for(int j=0; j<c+1; j++)
						sb.append("1");
				}
			}
			else {
				for(int j=0; j<c+1; j++)
					sb.append("1");
				for(int j=0; j<a; j++)
					sb.append("0");
				for(int j=0; j<b; j++) {
					if(j%2==0)
						sb.append("0");
					else
						sb.append("1");
				}
			}
			System.out.println(sb.toString());
		}
		
		input.close();
	}
}
