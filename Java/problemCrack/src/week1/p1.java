package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		while ((s = br.readLine()) != null) {
			int word = 0;
			int num = 0;
			int temp = 0;
			char[] list = s.toCharArray();
			for(int i=0; i<s.length(); i++) {
				if(list[i]!=' ') {
					num++;
					if(temp==0){
						word++;
						temp++;
					}
				}
				else {
					temp=0;
				}
			}
			System.out.println(word+" "+num);
		}
	}
}
