package baekjoon;

import java.util.Scanner;

public class n11721 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String[] split = a.split("");
		StringBuilder s = new StringBuilder("");

		
		for(int i=0; i<split.length; i++) {
			s.append(split[i]);
			if(s.length()%10==0) {
				System.out.println(s);
				s.delete(0,s.length());
			}
		}
		
		System.out.println(s);
		input.close();
	
	}
}