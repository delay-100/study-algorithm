package baekjoon;

import java.util.Scanner;

public class n2675 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String[] list = new String[n];
		int[] num = new int[n];
		String[] stringlist = new String[n];
		String s = "";
		
		for(int i=0; i<n; i++) {
			num[i] = input.nextInt();
			list[i] = input.nextLine();
			String[] temp = list[i].split("");
			for(int j=0; j<list[i].length(); j++) {
				for(int k=0; k<num[i]; k++) {
					s += temp[j];
				}
			}
			stringlist[i] = s.trim();
			s="";
		}
		
		
		for(int i=0; i<n; i++)
			System.out.println(stringlist[i]);
		
		
		input.close();
	}
}
