/* Function Overloading 

    Multiple functions in a class with the same name 
    but different parameters is 
    called Function Overloading

    */
public class no27{
    
    //Function 1 (Function Overloading)
    public static int function(int x,int y){
        int s=x+y;
        return(s);
    }

    //Function 2 (Function Overloading)
    public static float function(float x,float y){
        float s=x+y;
        return(s);
    } 

    //Function 3 (Function Overloading)
    public static long function(long x,long y){
        long s=x+y;
        return(s);
    }

    //Function 4 (Function Overloading)
    public static int function(int x,int y,int z){
        int s=x+y+z;
        return(s);
    }

    // Main method
        public static void main(String args[]){
        int a=15,b=15,g=15;
        float c=15,d=15;
        long e=15,f=15;
        System.out.println(function(a,b));   //function call
        System.out.println(function(c,d));   //function call
        System.out.println(function(e,f));   //function call
        System.out.println(function(a,b,g));   //function call
    }
}