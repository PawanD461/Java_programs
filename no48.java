/* Sum of first natural numbers using Recursion */

import java.util.*;
class no48{
    public static int sum(int n) {
        if(n==0) {
            return 0;
        }

        System.out.print(n+"+");
        return n+sum(n-1);
    }

    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);

        System.out.print("Enter the value for n :");
        int n = s.nextInt();

        System.out.print("\b="+sum(n));
    }
}