/* Factorial of a given number using Recursion */

import java.util.*;

class no47 {

    public static int fact(int n) {
        if(n==0) {
            return 1;
        } 
        
        System.out.print(n+"*");
        return n*fact(n-1);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the value for n :");
        int n = s.nextInt();
        
        System.out.println("\b="+fact(n));
    }
}