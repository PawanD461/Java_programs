/*
Insertion sort algorithm 
its complexity is O(n square)
*/

public class no36{

    //Insertion sort method  in Ascending order   
    public static void insertion(int a[]) {
        
        for(int i=1; i<a.length; i++){
            int curr=a[i];
            int prev=i-1;
            
            //finding out the correct position to insert
            while(prev>=0 && a[prev]>curr) {    // change the less then sign to 
                a[prev+1] = a[prev];            // grater then sing for sorting in Descending Order
                prev--;
            }
            
            //insertion
            a[prev+1]=curr;
        }
    }

    //printing method of sorted array
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

    //main method
    public static void main(String args[]){
        int array[]={4,6,3,2,7,8,1,9,5};
        insertion(array);
        print(array);
    }
}