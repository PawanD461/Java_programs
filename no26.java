//Functions with parameters and function call with argument pass
public class no26{
    
    //Addition method (User define function)
    public static String add(int x,int y){         //parameters or formal parameters 
        int m=x*y;
        int sum=x+y;
        System.out.println(sum);
        return("Addition function called ");
    }

    //Multiplication method (User define function)
    public static String mul(int x,int y){      //parameters or formal parameters 
        int m=x*y;
        System.out.println(m);
        return("Multiplication function called ");
    }

    //Main method (inbuilt function)
    public static void main(String args[]){
        int a=7, b=6;

        //function calling part
        String A=add(a,b);      //arguments or actual parameters also it is called call by value 
        String B=mul(a,b);      //call by reference is not possible in java
        System.out.println(A);
        System.out.println(B);
    }
}