package Round611_div3;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();
		for(int i=0; i<t; i++) {
			int h = input.nextInt();
			int m = input.nextInt();
			
			System.out.println((23-h)*60+60-m);
			
		}
		input.close();
	}
}
