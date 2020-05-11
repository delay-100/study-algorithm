package OzonTech2020;

import java.util.Arrays;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		byte a = input.nextByte();

		for (int i = 0; i < a; i++) {
			byte b = input.nextByte();
			short[] list1 = new short[b];
			short[] list2 = new short[b];
			
			for (int j = 0; j < b; j++) {
				list1[j] = input.nextShort();
			}
			for (int j = 0; j < b; j++) {
				list2[j] = input.nextShort();
			}
			
			Arrays.sort(list1);
			Arrays.sort(list2);
			
			StringBuilder sb1 = new StringBuilder("");
			StringBuilder sb2 = new StringBuilder("");

			for (int j = 0; j < b; j++) {
				sb1.append(list1[j]+" ");
				sb2.append(list2[j]+" ");
			}
			System.out.println(sb1);
			System.out.println(sb2);
		}

		input.close();
	}

}
