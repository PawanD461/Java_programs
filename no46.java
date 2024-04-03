/* Using Recursion print 1 to n numbers in Increasing order */

import java.util.*;
class no46 {
   static void printfunction(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printfunction(n-1);
        System.out.print(n+" ");
        }

    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);
        int n;
        System.out.print("Enter the value for n: ");
        n = s.nextInt();

        printfunction(n);       
    }
}