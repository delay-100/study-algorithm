package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class n1929 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		if(a==1&&b>=2)
			numbers.add(2);
		if(a==1&&b>=3)
			numbers.add(3);
		if(a==2&&b>=2)
			numbers.add(2);
		if(a<=3&&b>=3)
			numbers.add(3);
		
		for(int i =1; i<b; i++) {
			
			if(((6*i-1)>=a)&&(6*i-1)<=b) {
				numbers.add(6*i-1);
			}
			if(((6*i+1)>=a)&&(6*i+1)<=b) {
				numbers.add(6*i+1);
			}
		}
		ArrayList<Integer> uniqueItems = new ArrayList<Integer>(new HashSet<Integer>(numbers));
		Collections.sort(uniqueItems);
		Iterator<Integer> it = uniqueItems.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		input.close();
	}
}
