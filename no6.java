/* Type casting (narrowing or explicit conversion) in java */
import java.util.*;
public class no6{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        /*In type casting we forcefully convert 
        a larger size of date type into a small size 
        of data type by avoiding lossy conversion*/
        float f=43.54f;
        int i=(int)f; //in this case we forcefully converted to integer so we lost the dacimal data
        System.out.println(i);
    }
}