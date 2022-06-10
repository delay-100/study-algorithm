package Sorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class record {

	public static cRecord[] inserctionsorting(cRecord[] record) {
		for (int i = 1; i < record.length; i++) {
			int nextPos = i;
			char nextVal = record[nextPos].grade();
			cRecord nextVala = record[nextPos];
			while ((nextPos > 0) && (nextVal < record[nextPos - 1].grade())) {
				record[nextPos] = record[nextPos - 1];
				nextPos--;
			}
			record[nextPos] = nextVala;
		}
		return record;
	}

	public static void quicksorting(cRecord[] record, int lowest, int highest) {
		if (lowest >= highest)
			;
		else {
			int pivot = record[(highest + lowest) / 2].penalty();
			int down = lowest;
			int up = highest;

			do {
				while (record[down].penalty() < pivot)
					down++;
				while (record[up].penalty() > pivot)
					up--;

				if (down <= up) {
					cRecord temp = record[down];
					record[down] = record[up];
					record[up] = temp;
					down++;
					up--;
				}
			} while (down <= up);

			if(lowest<up)
				quicksorting(record, lowest, up);
			if(highest>down)
			quicksorting(record, down, highest);
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.println("정렬하고 싶은 텍스트 파일의 이름을 입력하세요.");
		System.out.println("목록 : recordData1.txt, recordData2.txt, recordData3.txt");

		String f = input.next();
		File file = new File(f);
		BufferedReader b = new BufferedReader(new FileReader(file));

		ArrayList<String> list = new ArrayList<String>();

		String line;
		while ((line = b.readLine()) != null) {
			if (line.equals(""))
				;
			else {
				list.add(line);
			}
		}

		cRecord[] cr = new cRecord[list.size()];

		for (int j = 0; j < list.size(); j++) {
			line = list.get(j);
			StringTokenizer tk = new StringTokenizer(line, " ");
			String token;
			int i = 0;
			char grade = ' ';
			int penalty = -1;
			String name = "";
			i = 0;
			while (tk.hasMoreTokens()) {
				token = tk.nextToken();
				if (i == 0) {
					grade = token.charAt(0);
					i++;
				} else if (i == 1) {
					penalty = Integer.parseInt(token);
					i++;
				} else if (i == 2) {
					name = token;
					i++;
				} else if (i > 2) {
					name = name + " " + token;
				}
			}
			cr[j] = new cRecord(grade, penalty, name);
		}

		cr = inserctionsorting(cr);
		int[] count = new int[5];
		for (int i = 0; i < cr.length; i++) {
			if (cr[i].grade() == 'A') {
				count[0]++;
			} else if (cr[i].grade() == 'B') {
				count[1]++;
			} else if (cr[i].grade() == 'C') {
				count[2]++;
			} else if (cr[i].grade() == 'D') {
				count[3]++;
			} else if (cr[i].grade() == 'F') {
				count[4]++;
			}
		}

		int left = 0;
		int right = -1;
		for (int i = 0; i < 5; i++) {
			if (count[i] == 0)
				;
			else if (count[i] == 1) {
				right++;
				left++;
			} else {
				right += count[i];
				quicksorting(cr, left, right);
				left = right + 1;
			}
		}
		for (int i = 0; i < cr.length; i++) {
			System.out.println(cr[i].grade() + " " + cr[i].penalty() + " " + cr[i].name());

		}

		b.close();
		input.close();
	}
}