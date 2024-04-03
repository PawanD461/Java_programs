/* Fibonacci series method 2 Using Recursion */

import java.util.*;
class no50{

    public static int fibo (int n) {
        if ( n==0 || n==1 ) {
            return n;
        }

        else {
            int fm1 = fibo(n-1);
            int fm2 = fibo(n-2);

            int fb = fm1+fm2;
            return fb;
        }
    }


    public static void main (String args[]) {
        Scanner s = new Scanner (System.in); 

        System.out.println("Enter the value for n :");
        int n = s.nextInt();

        for(int i=0; i<n; i++) {
            System.out.print(fibo(i)+" ");
        }
    }
}