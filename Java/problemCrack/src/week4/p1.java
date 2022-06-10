package week4;

import java.util.Scanner;

public class p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		int[] n1 = new int[26];
		int[] n2 = new int[26];
		
		for(int i=0; i<c1.length; i++) {
			n1[c1[i]-'a']++;
		}
		for(int i=0; i<c2.length; i++) {
			n2[c2[i]-'a']++;
		}
		int num = 0;
		for(int i=0; i<26; i++) {
			if(n1[i]!=n2[i]) {
				if(n1[i]<n2[i]) {
					num = num+n2[i]-n1[i];
				}
				else {
					num = num+n1[i]-n2[i];
				}
			}
		}
		
		System.out.println(num);
		
		input.close();
	}
}
