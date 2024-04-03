/*  Single Level Inheritance */

public class no42 {
    public static void main(String args[]) {
        //Teacher obj1 = new Teacher(30000,"parateacher","math");
        TA obj2 = new TA(0.08f);

        obj2.display();
    }
}

//Base class or parent class
class Teacher {
    int Salary=30000;
    String Post = "parateacher", Subject = "Math";
  //  Teacher(int s, String p, String sub) {
    //    Salary = s;
   //     Post = p;
    //    Subject = sub;  
  //  }
}

//derived class or child class 
class TA extends Teacher {
    float Ta;
    TA (float t) {
        Ta = Salary*t;
    }

    void display() {
        System.out.println("Salary = "+Salary+"\n Post is "+Post+"\n Subject = "+Subject+"\n TA = "+Ta);
    }
}

