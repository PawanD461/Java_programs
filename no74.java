// Container With Maximum Water (Approach 2) its complexity is O(n) {2 pointer approach}

import java.util.ArrayList;

class no74 {

    public static int maxWater(ArrayList<Integer> height) {
        int max = 0;
        int lp= 0; 
        int rp = height.size()-1;

        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp-lp;
            max = Math.max(ht * wt, max);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return max;
    }

   
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(9);
        intList.add(2);
        intList.add(2);
        intList.add(2);
        intList.add(1);
        intList.add(1);
        intList.add(1);
        intList.add(9);
        
        
        System.out.println();
        System.out.println("The Hight of the n lines are :" + intList);

        System.out.print("Maximum amount of Water can be stored is: "+maxWater(intList));
        
    }
}