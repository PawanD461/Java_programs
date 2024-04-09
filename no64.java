// RECURSION

// first occurence of an element in a array

import java.util.*;
public class no64{

    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key , i+1);
    }
    
    public static void main(String[] args) {
        int arr[] = {4,5,7,1,8,0,2,3,9,6};
        System.out.println(firstOccur(arr, 5, 0));
        
    }
}