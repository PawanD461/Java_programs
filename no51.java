/* Copy Constructor, Parameterized Constructort, Copy Constructor */


 class no51{
    public static void main(String args[]) {
        Student d = new Student();
        
        Student s = new Student(5,"Pawan Das");
        s.password = "Newton" ;
        s.display();

        Student s1 = new Student(6,"Bishal Das");
        s1.password = "Newton2";
        s1.display();

        Student cps = new Student(s);
        cps.password = "New_password";
        cps.display();
    }
}

public class Student{
    int roll;
    String password,name;

    Student(){
        System.out.println("\nDefault Constructor");
    }                      //Default constructor 

    Student(int roll, String name){  // Parameterised Constructor
        this.roll = roll;
        this.name = name;
    }

    Student(Student x) {
        this.name = x.name;
        this.roll = x.roll;
    }

    void display(){
        System.out.println("\n\nRoll = "+roll+"\nName = "+ name+"\nPassword = "+password);
    }
}
