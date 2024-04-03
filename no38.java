/*
Inbuilt sort in  java 
complexity of this type of sorting is O(n logn)
*/

import java.util.Arrays;
import java.util.Collections;

public class no38{
    
    //printing method of sorted array
    public static void print(Integer ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String args[]){
       Integer arr[]={3,56,43,2,15,7,0,87,65,5,32};         // it works with only object types Except primitive types (int couldn't run here)
        //Sorting in descending order
        //Arrays.sort(arr,Collections.reverseOrder());
      
        //sorting a specific part of an array in descending Order 
        //(passed arguments are as (array , starting index 0,ending index 8 ,Collections.reverseOrder() )  )
        Arrays.sort(arr, 0, 8,Collections.reverseOrder()); 
        print(arr);
    }
}