//Selection sort
public class no35{
    
    //sorting method in decreasing order
    public static void sort(int a[]){
        int n=a.length;
        for(int i=0; i<n-1; i++){
            int max=i;
            for(int j=i+1; j<n; j++){
                if(a[max]<a[j]){
                    max = j;
                }
            }

            //swap
            int t=a[max];
            a[max]=a[i];
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