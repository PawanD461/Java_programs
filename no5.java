/* Type/Widening/Implicit conversion, in java */
import java.util.*;
public class no5 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //Data type casting flow 
    //byte->short->int->float->long->doubl
    
    //Example 1
    System.out.println("Example 1");
    System.out.println("a is integer, b is float, c is long, d is double\n");
    System.out.print("a = ");
    int a=sc.nextInt();
    System.out.print("b = ");
    float b=sc.nextFloat();
    System.out.print("c = ");
    long c=sc.nextLong();
    System.out.print("d = ");
    double d=sc.nextDouble();
    System.out.println("Eneter choice 1 - 5");
    System.out.println("Press 1 for int->float\nPress 2 for int->long\nPress 3 for int->double\nPress 4 for float->double\nPress 5 for long->double");
    int ch=sc.nextInt();
    switch(ch){
        case 1:b=a;break;   // size of destination type should be larger then size of source type
        case 2:c=a;break;   // And aslo be type compatible
        case 3:d=a;break;
        case 4:d=b;break;
        case 5:d=c;break;
        default : System.out.println("Wrong choice");
    }
    System.out.println("a = "+a);
    System.out.println("b = "+b);
    System.out.println("c = "+c);
    System.out.println("d = "+d);
    
    //Example 2
    System.out.println("\nExample 2");
    System.out.println("To convert integer into a float");
    System.out.print("Enter an integer here - ");
    float number=sc.nextInt();
    System.out.println("\n converted float is - "+number);
    
    //Example 3
    System.out.println("\nExample 3");
    System.out.println("Char to int conversion");
    char k='a';
    char m='b';
    System.out.println(k);
    System.out.println(m);
    int l=k;
    int x=m;
    System.out.println("integer is "+l);
    System.out.println("integer is "+m);
  }  
}
