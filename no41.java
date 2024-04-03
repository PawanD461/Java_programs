/*
Constuctors:
    - Default Constructor 
    - Parameterized Constructor
    - Copy Constructor (Incompleted)
*/

public class no41{
    public static void main(String args[]){

        Student obj1 = new Student();                       // there constructor overloading used 
        Student obj2 = new Student("Pawan Das", 1);         //this is an another example of polymorphism
        Student obj3 = new Student(89.6f);
        System.out.println(obj2.name+"\n");
        System.out.println(obj2.roll+"\n");
    } 
}
class Student{
     String name;
    int roll;
    float percentage;
    //default constructor 
    Student(){
        System.out.println("Default Constructor is called.....!");
    }

    //Parameterized Constructor 
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;   
    }

    Student(float percentage){           //Parameterized constructor
        this.percentage = percentage; 
    }
}
