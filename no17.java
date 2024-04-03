/*
    print a number is odd or even
*/
import java.util.*;
public class no17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Eneter the number");
        a=sc.nextInt();
        if(a%2 == 0){
            System.out.print("Number isEven");
        }
        else{
            System.out.print("Number is ODD ");
        }
    }
}