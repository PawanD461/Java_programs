/* Area of a circle using user input */
import java.util.Scanner;
public class no4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radious");
        float r=sc.nextFloat();
        float area=3.14f*r*r;
        System.out.println("Area of circle is "+area);
    }
}
