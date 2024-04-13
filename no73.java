// Container With Maximum Water (Approach 1) its complexity is O(n^2)

import java.util.ArrayList;

class no73 {

    public static int maxWater(ArrayList<Integer> height) {
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wt = j - i; 
                max = Math.max(ht * wt, max);
            }
        }
        return max;
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