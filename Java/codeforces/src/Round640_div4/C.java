package Round640_div4;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			int a = input.nextInt();
			int b = input.nextInt();

			int temp = 1;
			int num = 0;

			while (true) {
				if ( temp % a!= 0) {
					num+=a;
				}
				if (num == b) {
					break;
				} 
				else
					temp+=a;
				
			}
			System.out.println(temp);
		}

		input.close();
	}

}
