package week2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class p3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			char[] list = s.toCharArray();
			ArrayList<String> a = new ArrayList<String>();
			Map<String, Integer> m = new HashMap<String, Integer>();

			for (int i = 0; i < list.length - 1; i++) {
				if (((list[i] >= 65 && list[i] <= 90) || (list[i] >= 97 && list[i] <= 122))
						&& ((list[i + 1] >= 65 && list[i + 1] <= 90) || (list[i + 1] >= 97 && list[i + 1] <= 122)))
					a.add(new String(list, i, 2));

			}
			for (int i = 0; i < a.size(); i++) {
				Integer value = m.get(a.get(i));
				if (value == null) {
					value = 1;
				} else {
					value++;
				}
				m.put(a.get(i), value);
			}

			int max = 0;
			Set<Entry<String, Integer>> entries = m.entrySet();
			for (Map.Entry<String, Integer> entry : entries) {
				if (max < entry.getValue()) {
					max = entry.getValue();
				}
			}
			if (max <= 1) {
				System.out.println("Not present");
			} else {
				ArrayList<String> b = new ArrayList<String>();
				for (Map.Entry<String, Integer> entry : entries) {
					if (max == entry.getValue()) {
						b.add(entry.getKey());
					}
				}

				Collections.sort(b);
				for (int i = 0; i < b.size()-1; i++) {
					System.out.print(b.get(i) + " ");
				}
				System.out.print(b.get(b.size()-1));
				System.out.println();
			}
		}
	}
}
