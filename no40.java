/*
    Class And Object Creating and also function call
*/

//Main Class 
public class no40 {
    public static void main(String args[]){

       // Object creating for Pen class 
        Pen p1=new Pen();
    
        //Function call of Pen class with object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setPrice(10);
        System.out.println(p1.price);

        // Object creating for Student class 
        Student s=new Student();

        //Function call of Student class with object
        s.setResult("Pawan Das", 1, 87,89,90);

        System.out.println("Student Name :"+s.name+"\n"+"Roll no: "+s.roll+"\n"+"Percentage "+s.percentage+"\n"+"Total "+s.marks);


    }
}


//Object Classe 
class Pen {
    private String color;
    int price;

    void setColor( String color ){
        this.color = color;
    }

    void setPrice( int newPrice ){
       this.price = newPrice;
    }

    //Getter method
    String getColor(){
        return this.color;
    }

}

//Object class 
class Student{
    String name;
    int roll, marks;
    float percentage;

    void setResult(String studentName, int r, int s1, int s2, int s3 ){
        name = studentName;
        roll = r;
        marks = s1+s2+s3;
        percentage = (s1+s2+s3)/3 ;
    }
}

