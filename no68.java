// ArrayList 

/* ArrayList is a part of java collection framwork.
ArrayList cann't stor primitive data types directly
and also it's special characteristic is the size
of a arraylist. The size of a arraylist is dynamic size. */

//To use ArrayList we must import ArrayList 
import java.util.ArrayList;

class no68{
    public static void main(String[] args) {
        // Syntax for create an ArrayList
        ArrayList<Integer> intList= new ArrayList<>();
        ArrayList<String> strList= new ArrayList<>();
        ArrayList<Float> floatList= new ArrayList<>();

         /* 
        Operations in ArrayList 
         
        1. Add element  O(1)
        2. Get element O(1)
        3. Remove element O(1)
        4. Set element at index O(1)
        5. Contains element O(1)
        */

       //1. Add element  O(1)
        intList.add(4);
        intList.add(3);
        intList.add(7);
        intList.add(6);
        intList.add(8);

        intList.add(5,9); //O(n)

        System.out.println(intList);

        // 2. Get element O(1) (using index)
        // int element = intList.get(0);
        // System.out.println(element);
        
        // 3. Remove element O(1) (using index)
        // intList.remove(0);
        // System.out.println(intList);


        // 4. Set element at index O(1) (first index no and then the new value passed)
        // intList.set(0, 2);
        // System.out.println(intList);      


        // 5. Contains element O(1) (it checks a specific element is exist in arraylist or not. It returns only true or false)
        boolean check = intList.contains(3);

        if(check == true){
            System.out.println("Item founded");            
        }else{
            System.out.println("Item doesn't exist in the list");            
        }

        
    }
}