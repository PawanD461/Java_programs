/* Smalest element in Array */
public class no31{

    //small element searching method 
    public static int small(int arr[]){
        int min = Integer.MAX_VALUE; // Integer.MAX_VALUE is +infinity (Largest integer number)

        for(int i=0;i<arr.length;i++){
            if(min>=arr[i]){
                min=arr[i];
            }
        }
        return(min);
    }

   // main method
   public static void main(String args[]){
    int array[]={4,6,23,7,96,4,3,245,65,232};
    System.out.println("Smallest number in array is "+small(array));
   }
}