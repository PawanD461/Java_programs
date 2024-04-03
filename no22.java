/*
Number pattern 1
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
*/
import java.util.*;
public class no22{
    public static void main(String args[]){
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            System.out.print(" ");
            for(j=1;j<=i;j++)
            System.out.print(i+" ");
            System.out.println("");
        }
    }
}