/*
    else if statement 
*/
import java.util.*;
public class no18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Eneter the Age");
        a=sc.nextInt();
        if(a>=18){
            System.out.print("Adult");
        }
        else if(a>=13 && a<18){
            System.out.print("teenager");
        }
        else{
            System.out.print("child");
        }
    }
}