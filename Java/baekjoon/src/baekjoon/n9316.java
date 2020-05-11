package baekjoon;

import java.util.Scanner;

public class n9316 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		for(int i=0; i<a; i++)
			System.out.println("Hello World, Judge "+ (i+1)+"!");
		input.close();
	}

}
