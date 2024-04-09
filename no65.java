// RECURSION

// print x to the power n


// complexity is O(n)
import java.util.*;
class no65{
    public static int power(int x, int n){
        if (n== 1){
            return x;
        }
        // if(n==0){
        //     return 1;
        // }
        int res = x*power(x, n-1);
        return res; 
    }


// more optimized complexity is O(logn)
    public static int optimizedPower(int x, int n) {
        if(n == 0){
             return 1;
        }
        int half_power = optimizedPower(x, n/2);
        int opt_res = half_power*half_power;

        if(n % 2 != 0){
            return opt_res*x;
        }else{
            return opt_res;
        }

    }
    public static void main(String[] args) {
        int x =2 ;
        int n =10; 
        System.out.println(optimizedPower(x, n));        
    }
}

