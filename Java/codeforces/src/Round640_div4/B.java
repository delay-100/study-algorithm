package Round640_div4;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int[] list = new int[k];

			//È¦¼ö ÀÏ ¶§
			if((n-(k-1)>0)&& ((n-(k-1))%2==1)) {
				System.out.println("YES");
				for(int j=0; j<list.length-1; j++)
					System.out.print(1+" ");
			
			System.out.println(n-(k-1));
			}
			//Â¦¼ö ÀÏ ¶§
			else if(((n-(k-1)*2)>0) && ((n-(k-1)*2)%2==0)) {
				System.out.println("YES");
				for(int j=0; j<list.length-1; j++)
					System.out.print(2+" ");
				System.out.println((n-(k-1)*2));
			}
			else {
				System.out.println("NO");
			}
		}

		input.close();
	}

}