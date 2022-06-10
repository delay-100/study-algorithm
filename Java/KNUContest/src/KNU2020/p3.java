package KNU2020;

public class p3 {
	public static void main(String[] args) {

		// 65
		String src = "00011011100000";
		String answer="";
		char[] cc = src.toCharArray();
		char c = src.charAt(0);
		
		answer+=c;
		char ischange = c;
		int n = 0;
		for(int i=1; i<cc.length; i++) {
			if(cc[i]==ischange) {
				n++;
			}
			else {
				answer += (char)(65+n);
				n=0;
			}
			ischange = cc[i];
		}
		answer += (char)(65+n);
		System.out.println(answer);
	}
}
