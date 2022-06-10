package mathmatics;

import java.util.Scanner;

public class piboFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int j = input.nextInt();

		int num1 = 0;
		int num2 = 1;
		int sum = 1;

		for (int i = 0; i < j; i++) {
			System.out.print(sum + " ");
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		input.close();
	}
}