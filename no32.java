/* Binary Search in Array */

public class no32{
    public static int binary(int arr[] , int key){
        int beg=0, end=arr.length-1;

        while(beg<=end){
            int mid = (beg+end)/2;

            //compare
            if(arr[mid]== key){
                return mid;
            } 
            if(arr[mid] < key){ //right
                end=mid+1;
            }
            else{               //left
                end = mid-1;
            }
        }
        return (-1);
    }

    // Main method 
    public static void main(String args[]){
        int array[]={2,3,4,5,6,7,8,9,10,12,14,15};
        int key=7;
        
        int c =  binary(array, key);
        if(c>=0){
        System.out.println("index of key is : " +c );
        }
        else{
            System.out.println("Not found ");
        }
    }
}