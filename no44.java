/* Hirarchical inheritance */

//Base class 
class Animals{
    void legs() {
        System.out.println("\nThey have 2 legs ");
    }

    void hands() {
        System.out.println("\nThey have 2 hands ");
    }
}

//Derived class 1
class Monkey extends Animals {
    String haircolor;

    void eat(){
        System.out.println("\nEats froutes ");
    }
     
    void walk() {
        System.out.println("\nThey can walks with 2 legs");
    }
}

//Derived class 2
class Gorilla extends Animals {
    void eatsmore () {
        System.out.println("\nThey eats more fruites");
    }

    void run () {
        System.out.println("\nThey can run easily");
    }
}

class no44 {
    public static void main(String args[]) {

        //Object creation
        Monkey  derive1 = new Monkey();
        Gorilla derive2 = new Gorilla();

        //function call
        derive1.legs();
        derive2.legs();
       
        derive2.hands();
        derive1.hands();
    }
}