/* Linear Search code with Function creation */
import java.util.*;

//Linear Search
public class no29{
    public static int linearSearch(int array[], int key){
        for(int i=0;i<array.length;i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    //Main Method
    public static void main(String args[]){
        int array[]={55,65,32,877,98,54,56,87};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search linear ");
        int k=sc.nextInt();
        int position = linearSearch(array,k);
        if (position==-1){
            System.out.print("Not Found ");
        }else{
            System.out.print("The number is in "+position+"th position");
        }
    }
}