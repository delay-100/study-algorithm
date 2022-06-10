package temp;

import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] m = new int[n];
      int[] e = new int[n];
      for (int i = 0; i < n; i++)
         m[i] = input.nextInt();

      if (n == 0) {
         System.out.print(0);
         System.exit(0);
      }

      e[0] = m[0];
      if (n >= 2)
         e[1] = m[0] + m[1];
      int temp=0;
      if (n >= 3) {
         if (m[1] + m[2] > m[0] + m[2])
            temp = m[1] + m[2];
         else
            temp = m[0] + m[2];
         if(e[1]<temp) {
        	 e[2] = temp;
         }
         else {
        	 e[2] = e[1];
         }
      }

      for (int i = 3; i < n; i++) {
         int a = e[i - 1];
         int b = m[i] + e[i - 2];
         int c = m[i] + m[i - 1] + e[i - 3];
         if ((c > b && c > a) || (c > b && c == a) || (c > a && c == b))
            e[i] = c;
         if ((b > c && b > a) || (b > c && b == a) || (b > a && b == c))
            e[i] = b;
         if ((a > c && a > b) || (a > c && a == b) || (a > b && a == c))
            e[i] = a;
         if (a == b && b == c)
            e[i] = a;
      }

      System.out.print(e[n - 1]);

      input.close();
   }
}