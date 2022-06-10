package mathmatics;

import java.util.Scanner;

public class pibo2 {
	public static int fibo(long n) {
		if (n <= 1)
			return 1;
		else
			return (fibo(n - 2) + fibo(n - 1));
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		long j = input.nextInt();

		long start = System.currentTimeMillis();
		for (long i = 0; i < j; i++) {
			System.out.print(fibo(i) + " ");
		}
		long end = System.currentTimeMillis();
		System.out.println();
		System.out.println("실행 시간 : " + (end - start) / 1000.0);

		input.close();
	}
}