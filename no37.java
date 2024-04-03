/*
Inbuilt sort in  java 
complexity of this type of sorting is O(n logn)
*/

import java.util.Arrays;

public class no37{
    
    //printing method of sorted array
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={3,56,43,2,15,7,0,87,65,5,32};
       
        /*
        Sorting in Ascending order
        Arrays.sort(arr);
        print(arr);  
        */

        //sorting a specific part of an array 
        //(passed arguments are as (array , starting index 0,ending index 8)  )
        Arrays.sort(arr, 0, 8); 
        print(arr);
    }
}