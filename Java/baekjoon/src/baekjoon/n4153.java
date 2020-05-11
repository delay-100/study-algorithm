package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class n4153 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] list = new int[3];
		
		while(true) {
			list[0] = input.nextInt();
			list[1] = input.nextInt();
			list[2] = input.nextInt();
			
			if(list[0]==0&&list[1]==0&&list[2]==0)
				break;
			
			Arrays.sort(list);
			if((list[2]*list[2])==((list[0]*list[0])+(list[1]*list[1])))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
		
		input.close();
	}

}
