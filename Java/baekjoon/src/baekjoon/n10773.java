package baekjoon;

import java.util.Scanner;

public class n10773 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int sum = 0;
		int temp = 1;

		for (int i = 0; i < a; i++) {
			int num = input.nextInt();
			sum += num;
			if (num == 0) {
				sum -= temp;
				
			} else
				temp = num;
			System.out.println("num = "+num);
			System.out.println("sum = "+sum);
			System.out.println("temp = "+temp);
			System.out.println("--------------");
		}
		System.out.println(sum);

		input.close();
	}
}
