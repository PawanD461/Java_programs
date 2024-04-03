/* Variable and data types*/
import java.util.*;
public class no9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cost of pen ");
        float p1=sc.nextFloat();
        System.out.print("Enter the cost of pencil ");
        float p2=sc.nextFloat();
        System.out.print("Enter the cost of eraser ");
        float p3=sc.nextFloat();
        float total=p1+p2+p3;
        System.out.println("The total cost of goods is "+total);
        float tax=(0.18f*total);
        System.out.println("Including tax "+(total+tax));
    }
}