/* Array Basic and array as function arguments */
import java.util.*;
public class no28{
    
    public static void addi(int array[]){   //Array as parameters 
        int i;
        for(i=0;i<array.length;i++){
            array[i] = array[i]+1;
        }
    }

    //Main Method
    public static void main(String args[]){
        int a[]={4,5,6,8,3},i;
        addi(a);                    //Array as arguments (Call by reference)
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}