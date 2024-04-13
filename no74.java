// Container With Maximum Water (Approach 1) its complexity is O(n^2)

import java.util.ArrayList;

class no74 {

    public static int maxWater(ArrayList<Integer> height) {
        int max = 0;
        int lp= 0; 
        int rp = height.size()-1;
        System.out.println(rp);
        return 1;
    }

   
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(8);
        intList.add(9);
        intList.add(6);
        intList.add(8);
        intList.add(1);
        intList.add(8);
        intList.add(5);
        intList.add(7);
        intList.add(8);
        System.out.println();
        
        System.out.println("The Hight of the n lines are :" + intList);

        System.out.print("Maximum amount of Water can be stored is: "+maxWater(intList));
        
    }
}