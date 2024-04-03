/*
    Largest among three numbers 
*/
import java.util.*;
public class no20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Eneter the value for a");
        a=sc.nextInt();
        System.out.println("Eneter the value for b");
        b=sc.nextInt();
        System.out.println("Eneter the value for c");
        c=sc.nextInt();
        if((a>=b) && (a>=c)){
            System.out.print("Largest is a ");
        }
        else if(b>=c){
            System.out.print("Largest is b");
        }
        else{
            System.out.print("Largest is c");
        }
    }
}