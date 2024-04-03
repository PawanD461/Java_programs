/*All expexted Subarrays and their sum in a single array*/
import java.util.*;
class no58{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a[] =new int[10];

        for(int i=0; i<10; i++) {
            System.out.print("Enter the value for a["+i+"] :");
            a[i]=s.nextInt();
        }
        
        System.out.println("All possible subarrays And thier sum:");
        for(int k=0; k<a.length; k++){
            for(int i=k; i<a.length; i++) {
                int sum = 0;
                for(int j=k; j<=i; j++) {
                    sum += a[j];
                    System.out.print(a[j]+"+");
                }
                System.out.println("\b = "+sum);
            }
            System.out.print("\n");
        }
    }
}