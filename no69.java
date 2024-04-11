// Size of ArrayList


import java.util.ArrayList;

class no69{

    public static void main(String[] args) {
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(4);
        intList.add(3);
        intList.add(7);
        intList.add(6);
        intList.add(8);
        System.out.println();        
        System.out.println("the list is "+intList);

        System.out.println();
        System.out.println("The size of the list is "+intList.size());
        System.out.println();        

        for(int i=0; i<intList.size(); i++){
            System.out.println("Item by iteration "+ intList.get(i));            
        }
        
    }
}