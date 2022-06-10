package week9;

import java.util.Scanner;

public class p1_2{

   static int[] list;
   static boolean[] ischecked;
   static int[] dae1;
   static int[] dae2;
   static int n;

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      n = input.nextInt();
      list = new int[n];
      ischecked = new boolean[n];
      dae1 = new int[2*n];
      dae2 = new int[2*n];
      findQueen(0);

      input.close();
   }

   public static void findQueen(int i) {
      for (int j = 0; j < n; j++) {
         int dae1index = n - 1 + i - j;
         if (!ischecked[j] && (dae1[dae1index] == 0) && (dae2[i + j] == 0)) {
            list[i] = j;
            if (i == n - 1) {
               for (int k = 0; k < n; k++) {
                  for (int q = 0; q < n; q++) {
                     if (q == list[k])
                        System.out.print("Q ");
                     else
                        System.out.print("* ");
                  }
                  System.out.println();
               }
               System.out.println();
               return;
            } else {
               ischecked[j] = true;
               dae1[dae1index] = 1;
               dae2[i + j] = 1;
               findQueen(i + 1);
               ischecked[j] = false;
               dae1[dae1index] = 0;
               dae2[i + j] = 0;
            }
         }
      }
   }
}