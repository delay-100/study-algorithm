package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class n2751 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
			int a = Integer.parseInt(bf.readLine());

			ArrayList list = new ArrayList();

			for (int i = 0; i < a; i++) {
				list.add(Integer.parseInt(bf.readLine()));
			}

			Collections.sort(list);

			Iterator it = list.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}

		} catch (NumberFormatException | IOException e) {

			e.printStackTrace();
		}

	}
}
