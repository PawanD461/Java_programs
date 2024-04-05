// RECURSION

// Print numbers in increasing order 
import java.util.*;
public class no60{

    public static void decreasingOrder(int f, int l) {
       
        if(l == f){
            System.out.print(l);
            return;
        }
        System.out.print(f+" ");
        decreasingOrder(f+1, l);
    }

    public static void main (String args[]) {
        int n = 10; 
        int l = n; 
        int f = l-(n-1);
        decreasingOrder(f, l);
    }
}