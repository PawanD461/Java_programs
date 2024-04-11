// Print Reverse of an ArrayList 

import java.util.ArrayList;

class no70{
    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(7);
        intList.add(6);
        intList.add(8);
        System.out.println();        
        System.out.println("the list is "+intList);

        System.out.print("The reversed List is [");
        int size = intList.size()-1;
        for(int i=size; i>=0; i--){
            System.out.print(intList.get(i)+", ");            
        }
        System.out.print("\b\b]");
        
    }
}