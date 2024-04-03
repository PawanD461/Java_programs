/*User input syntax of all data type with Scanner class*/
import java.util.*;
public class no3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //String input syntax
        System.out.println("Enter the string");
        String name=sc.next();
        System.out.println("String = "+name);
        // String with Lines syntax
        System.out.println("Enter the Line");
        String ln=sc.nextLine();
        System.out.println("Line is : "+ln);
        //Integer input syntax
        System.out.println("Enter the Integer");
        int i=sc.nextInt();
        System.out.println("Integer = "+i);
        //Byte input syntax
        System.out.println("Enter the byte");
        byte b=sc.nextByte();
        System.out.println("The byte is = "+b);
        //Float input syntax
        System.out.println("Enter the float number");
        float f=sc.nextFloat();
        System.out.println("Float value = "+f);
        //Double number input syntax
        System.out.println("Enter the double number");
        double d=sc.nextDouble();
        System.out.println("Double value = "+d);
        //boolean input syntax
        System.out.println("Enter the boolean value");
        boolean x=sc.nextBoolean();
        System.out.println("Boolean value = "+x);
        //Short number input syntax
        System.out.println("Enter the short number");
        short s=sc.nextShort();
        System.out.println("Short number = "+s);
        //Long number input syntax
        System.out.println("Enter the long number");
        long l=sc.nextLong();
        System.out.println("Long number = "+l);
    }
}
