/* Using Recursion print 1 to n numbers in decreasing order */

import java.util.*;
class no45 {
   static void printfunction(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printfunction(n-1);
        }

    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n;
        System.out.print("Enter the value for n: ");
        n = s.nextInt();

        printfunction(n);       
    }
}