/* Selection sort
pick the smallest(from unsorted),
put it at the beginning
*/
public class no34{
    
    //sorting method in increasing order
    public static void sort(int a[]){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            int min=i;
            for(int j=i+1; j<n; j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }

            //swap
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }

    //printing method of sorted array
    public static void print(int ar[]){
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
    
    // Main method
    public static void main(String args[]){
        int array[]={5,4,6,3,2,7,1};
        sort(array);
        print(array);
    }
}