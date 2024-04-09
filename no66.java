// RECURSION

// Tiling problem with recursion

class no66{

    public static int tiling(int n){ //for 2 x n
        if(n==0 || n==1){
            return 1;
        }
        // for vertical tiles total ways to place
        int fnm1 = tiling(n-1);
        
        // for horizontaly tiles total ways to place
        int fnm2 = tiling(n-2);

        int total_ways = fnm1 + fnm2;
        return total_ways;
    }
    public static void main(String[] args) {
        System.out.println(tiling(0));        
    }
}