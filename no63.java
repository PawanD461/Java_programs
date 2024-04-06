// RECURSION

// Factorial of a number  
import java.util.*;
public class no63{

    public static int facto(int n) {       
      
        if(n==0){
            System.out.print(n + "*");
            return 1;
        }
        int nm1 =facto(n-1);
        System.out.print(n + "*");        
        int f = n * nm1;
        return f;
    }

    public static void main (String args[]) {
        int n = 5; 
        System.out.println("\b = "+facto(n));

    }
}