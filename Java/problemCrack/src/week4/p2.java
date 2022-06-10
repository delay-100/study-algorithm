package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String st = "";
		String s1 = br.readLine();
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		Map<String, Character> m = new HashMap<String, Character>();

		int p = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < s.length(); k++) {
				m.put(String.valueOf(c[i]) + String.valueOf(c[k]), c1[p]);
				p++;
			}
		}
//	     for(String key :m.keySet()){
//	            Character value = m.get(key);
//	            System.out.println(key+" : "+value);
//	 
//	        }
		while ((st = br.readLine()) != null) {
			String answer = "";
			boolean istrue = true;
			char[] cc = st.toCharArray();
			for (int i = 0; i < cc.length; i++) {
				if (97 <= cc[i] && cc[i] <= 122) {
					cc[i] = (char) (cc[i] - 32);
				}
			}
			for (int i = 0; i < cc.length; i += 2) {
				if (cc[i] == ' ') {
					answer += " ";
					i--;
				} else {
					if (i + 1 < cc.length && m.containsKey(String.valueOf(cc[i]) + String.valueOf(cc[i + 1]))) {
						answer += m.get(String.valueOf(cc[i]) + String.valueOf(cc[i + 1]));
					} else {
						istrue = false;
						break;
					}
				}

			}
			if (!istrue) {
				System.out.println("-ERROR-");
			} else {
				System.out.println(answer);
			}
		}

	}
}
