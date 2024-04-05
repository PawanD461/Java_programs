// RECURSION

// Print numbers in decreasing order using recursion
import java.util.*;
public class no60{

    public static void decreasingOrder(int n) {
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        decreasingOrder(n-1);
    }

    public static void main (String args[]) {
        int n = 10; 
        decreasingOrder(n);
    }
}