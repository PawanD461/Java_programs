/*Add and multiplication of two numbers with user input*/
import java.util.Scanner;;
public class no2 {
   public static void main(String args[]){
    Scanner obj=new Scanner(System.in);
    System.out.print("Enter the first number\n");
    int a=obj.nextInt();
    System.out.print("Enter the second number\n");
    int b=obj.nextInt();
    int sum=a+b;
    System.out.println(a+"+"+b+"="+sum);
   }
}
