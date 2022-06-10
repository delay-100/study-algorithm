package InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();
		String s;

		while (true) {
			System.out.println("Add number to list ( or 'quit' : end add number )");
			s = input.next();
			if (s.equals("quit"))
				break;
			else {
				list.add(Double.parseDouble(s));
			}
		}

		s = "";

		System.out.println("Original list");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "	");
		}
		System.out.println();

		while (true) {
			System.out.println("choose mode >>| '1': asc mode | '2': desc mode | 'quit' : End system");
			s = input.next();
			if (s.equals("quit"))
				break;
			else if (s.equals("1")) {
				ArrayList<Double> asclist = new ArrayList<Double>();
				for(int i=0;i<list.size();i++) {
					asclist.add(list.get(i));
				}
				System.out.println("Asc list sorting by InsertionSort list");
				int size = asclist.size();
				for (int i = 1; i < size; i++) {
					int nextPos = i;
					Double nextVal = asclist.get(nextPos);
					while ((nextPos > 0) && (nextVal.compareTo(asclist.get(nextPos - 1))< 0)) {
						asclist.remove(nextPos);
						asclist.add(nextPos, asclist.get(nextPos - 1));
						nextPos--;
					}
					asclist.remove(nextPos);
					asclist.add(nextPos, nextVal);
				}
				for (int i = 0; i < asclist.size(); i++) {
					System.out.print(asclist.get(i) + "	");
				}
				System.out.println();
			} else if (s.equals("2")) {
				ArrayList<Double> desclist = new ArrayList<Double>();
				for(int i=0;i<list.size();i++) {
					desclist.add(list.get(i));
				}
				System.out.println("Asc list sorting by InsertionSort list");
				int size = desclist.size();
				for (int i = 1; i < size; i++) {
					int nextPos = i;
					Double nextVal = desclist.get(nextPos);
					while ((nextPos > 0) && (nextVal.compareTo(desclist.get(nextPos - 1))> 0)) {
						desclist.remove(nextPos);
						desclist.add(nextPos, desclist.get(nextPos - 1));
						nextPos--;
					}
					desclist.remove(nextPos);
					desclist.add(nextPos, nextVal);
				}
				for (int i = 0; i < desclist.size(); i++) {
					System.out.print(desclist.get(i) + "	");
				}
				System.out.println();
			} else {
				System.out.println("Wrong command..\nOriginal list");
				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + "	");
				}
				System.out.println();
			}
		}

		input.close();
	}
}