// Bouble Short 
import java.util.*;
public class no33{
    
    //sorting method 
    public static void sort( int a[] ){
        int n = a.length;
        for(int i=0;i<n-1;i++){
	        for(int j=0;j<n-i-1;j++){
		        if(a[j]>a[j+1]){
			        int t=a[j];
			        a[j]=a[j+1];
			        a[j+1]=t;
		        }
	        }
        }
       // return (a);
    }

      // printing method of sorted array  
        public static void print(int ar[]){
            for(int i=0;i<ar.length;i++){
                System.out.print(ar[i]+" ");
            }
        }

        // Main method
        public static void main(String args[]){
        int arr[] = {56,32,65,34,53,76,3,8,80};
        sort(arr);
        print(arr);
       
    }
}