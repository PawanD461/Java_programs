/* Method Overriding */

class no52 {
    public static void main(String args[]) {
        B j = new B();
        j.sum() ;
    }
}

class A {
    void sum () {
        System.out.println("\nBase class");
    }
}

class B extends A {
    void sum () {
        System.out.println("\nDerived class");
    }
}

