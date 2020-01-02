package baekjoon;

import java.util.Scanner;

public class n1152 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String a;
		int count = 0;
		
		a = input.nextLine();
		a = a.trim();
		String[] list = a.split(" ");
		
		for(int i=0;i<list.length; i++) {
			if(list[i].isEmpty()) {
				count = 0;
			}
			else
				count++;
		}
		
		System.out.println(count);
		input.close();

	}
}
