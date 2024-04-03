/*Star Pattern Rhombus
        *****
       *****
      *****
     *****
    *****
*/

import java.util.*;
class no53 {
    public static void main(String args[]) {
        int i,n,j;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for(i=1; i<=n; i++) {
            for(j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}