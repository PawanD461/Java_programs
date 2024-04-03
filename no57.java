/*All expexted Subarrays in a single array*/
class no57{
    public static void main(String args[]) {
        int a[] = {2,4,6,8,10};

        for(int k=0; k<a.length; k++){
            for(int i=k; i<a.length; i++) {
                for(int j=k; j<=i; j++) {
                    System.out.print(a[j]);
                }
                System.out.println();
            }
        }
    }
}