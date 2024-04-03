/* Pair count in Array*/
class no56{
    public static void main(String args[]) {
        int a[] = {2,4,7,6,9,5,7,8,0};

        for(int i=0; i<a.length; i++) {
            for(int j=i+1; j<a.length; j++) {
                System.out.print("("+a[i]+","+a[j]+")");
            }
            System.out.println();
        }  
    }
}