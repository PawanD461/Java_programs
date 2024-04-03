/* Income tax claculate */
import java.util.*;
public class no19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income ");
        int i=sc.nextInt();
        int tax;
        if(i<500000){
            tax=0;
        }
        else if(i>=500000 && i<1000000){
            tax = (int)(i*0.2);
        System.out.println("20% of income");
        }
        else{
            tax=(int)(i*0.3);
        System.out.println("30% of income");
        }
        System.out.println("Income is "+i);
        System.out.println("Tax is "+tax);
    }
}