// Swap 2 numbers in ArrayList with set operation
// Collections.sort() Inbuilt method for sorting 

import java.util.ArrayList;
import java.util.Collections;
class no72{
    public static void swip(ArrayList<Integer> intList, int idx0, int idx1) {
        int temp = intList.get(idx0);
        intList.set(idx0, intList.get(idx1));
        intList.set(idx1, temp);

        System.out.print("Swaped Numbers of index "+ idx0 +" and "+idx1+":  ");
        System.out.println(intList);
    }
    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(9);
        intList.add(6);
        intList.add(8);
        intList.add(1);
        intList.add(8);
        intList.add(7);
        intList.add(2);
        System.out.println();        
        System.out.println("The list is :"+intList);
        swip(intList, 0, 8);

        // sort an arraylits using inbuilt sort function 
        // Ascending Order
        Collections.sort(intList);
        System.out.println("The sorted ArrayList in Ascending Order :"+intList); 

        // Descending Order
        Collections.sort(intList, Collections.reverseOrder()); // Collections.reverseOrder() is Comparator 
        System.out.print("The sorted ArrayList in Descending Order :"+intList+"\n\n"); 
    }
}