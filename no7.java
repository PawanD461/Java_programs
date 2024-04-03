/* Variable and data types */
import java.util.*;
public class no7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers to get average of their ");
        System.out.print("number 1 ");
        int n1=sc.nextInt();
        System.out.print("number 2 ");
        int n2=sc.nextInt();
        System.out.print("number 3 ");
        int n3=sc.nextInt();
        System.out.println("Average is "+(n1+n2+n3)/3);
    }
}