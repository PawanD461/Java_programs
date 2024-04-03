/* Largest element in Array */
public class no30{
    public static int large(int arr[]){
        int large = Integer.MIN_VALUE; // Integer.MIN_VALUE is -infinity (Smallest integer number)

        for(int i=0;i<arr.length;i++){
            if(large<=arr[i]){
                large=arr[i];
            }
        }
        return(large);
    }

   // main method
   public static void main(String args[]){
    int array[]={4,6,23,7,96,4,3,245,65,232};
    System.out.println("Largest number in array is "+large(array));
   }
}