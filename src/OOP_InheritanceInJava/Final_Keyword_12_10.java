package OOP_InheritanceInJava;

public class Final_Keyword_12_10 {
    public static void main(String[] args) {
        //after creating a public method on line 23
Circle c = new Circle(5);
System.out.println(c.calculateCircumference()); //31.4159
    }
}

class Circle{
    //final keyword can be used with variables, classes and methods.
    //final keyword with variables allows the value of the variable to be assigned only once.
    private final double PI = 3.14159;
    private double radius; //radius is going to be undefined

//creating a constructor called Circle
    public Circle(double radius){
        //assigning radius to a radius
        this.radius = radius;
    }
//creating a method called public, and it won't take any values
    public double calculateCircumference(){
        return 2 * PI * radius; //it will return a double
        //going to a main method

    }
}

