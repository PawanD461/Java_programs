/* Variable and data types*/
public class no10{
    public static void main(String args[]){
        byte b = 4;
        char c= 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        int $=24;

        double result = (f*d)+(i*c)-(d*s);
        System.out.println((f*d)+(i*c)-(d*s));//the result type is double because here the largest data type is double
        System.out.print(result);              //Type promotion method applied
        System.out.print("\n"+$);
    }
}