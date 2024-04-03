        //Data Types in Java
        /*
        There are two types of data in java 
        respectively 
        1.Primitive(Their are already exist in java )
            i->   byte  [size 1 byte(-128 To 127)256 numbers]
            ii->  short [Size 2 bytes]
            iii-> char  [Size 2 bytes]
            iv->  boolean[Size 1 bits (true or false)]
            v->   int   [Size 4 bytes (-2B to +2B)]
            vi->  long  [Size 8 bytes]
            vii-> float [Size 4 bytes]
            viii->double[Size 8 bytes]
        2.Non-Primitive(we have to create this type of data)
            i->   string
            ii->  array
            iii-> class
            iv->  object
            v->   interface
        */
public class javabasic{
    public static void main(String args[]){
        System.out.println("Hello World");
        byte b=127;
        System.out.println(b);
        short s=129;
        System.out.println(s);
        char c='@';
        System.out.println(c);
        boolean bln = true;
        System.out.println(bln);
        int i=b;
        System.out.println(i);
        long l=62734534;
        System.out.println(l);
        float f = 12.24f;
        System.out.println(f);
        double d=32.45345544332;
        System.out.println(d);
    }
}