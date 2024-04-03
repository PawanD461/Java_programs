/* Multilevel  Inheritance */

//Base class 1 
class animals{
    void legs() {
        System.out.println("\nThey have 2 legs ");
    }

    void hands() {
        System.out.println("\nThey have 2 hands ");
    }
}

//Derived class of Base class 1 / Base class 2
class monkey extends animals {
    String haircolor;

    void eat(){
        System.out.println("\nEats froutes ");
    }
     
    void walk() {
        System.out.println("\nThey walks with 2 legs");
    }
}

//Derived class of Base class 2
class humans extends monkey {
    void brain(){
        System.out.println("Finally got brain.....!");
    }
}


//Main class 
class no43 {
    public static void main(String args[]){
            humans obj=new humans();
            obj.legs();
            obj.hands();
            obj.eat();
            obj.walk();
            obj.brain();
    }
}