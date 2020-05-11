package baekjoon;

import java.util.Scanner;

public class n5063 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for(int i=0; i<a; i++) {
			int r = input.nextInt();
			int e = input.nextInt();
			int c = input.nextInt();
			
			if(r<(e-c))
				System.out.println("advertise");
			else if(r>(e-c))
				System.out.println("do not advertise");
			else if(r==(e-c))
				System.out.println("does not matter");
			
		}
		
		input.close();
	}

}
