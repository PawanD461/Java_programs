// RECURSION

// Print the sum of n numbers  
import java.util.*;
public class no62{

    public static int sumOfN(int n) {       
      
        if(n==1){
            System.out.print(n + "+");
            return 1;
        }
        int snm1 =sumOfN(n-1);
        System.out.print(n + "+");        
        int sum = n + snm1;
        return sum;
    }

    public static void main (String args[]) {
        int n = 5; 
        System.out.println("\b = "+sumOfN(n));

    }
}