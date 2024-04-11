// Find the Maximum in an arraylist

import java.util.ArrayList;

class no71{
    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(9);
        intList.add(6);
        intList.add(8);
        System.out.println();        
        System.out.println("the list is "+intList);


        int max = Integer.MIN_VALUE;  //(Integer.MIN_VALUE) is -Infinity
        for(int i=0; i<intList.size(); i++){
            if(max < intList.get(i)){
                max = intList.get(i);
            }           
        }
        System.out.print("The Maximun in the list is = "+max);
        
    }
}